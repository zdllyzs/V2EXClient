package com.zdlly.v2exclient.activity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.loopj.android.http.JsonHttpResponseHandler;
import com.zdlly.v2exclient.R;
import com.zdlly.v2exclient.model.LoginFormModel;
import com.zdlly.v2exclient.util.V2EX;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private TextInputEditText username;
    private TextInputEditText password;
    private Button login;
    private ProgressDialog mProgressDialog;
    private String usernameString;
    private String passwordString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {
        username = (TextInputEditText) findViewById(R.id.username);
        password = (TextInputEditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);

        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login:
                submit();
                break;
        }
    }

    private void submit() {
        // validate
        usernameString = username.getText().toString().trim();
        if (TextUtils.isEmpty(usernameString)) {
            Toast.makeText(this, "用户名不能为空", Toast.LENGTH_SHORT).show();
        }

        passwordString = password.getText().toString().trim();
        if (TextUtils.isEmpty(passwordString)) {
            Toast.makeText(this, "密码不能为空", Toast.LENGTH_SHORT).show();
        }
        getOnceCode();
        MainActivity.LOGINSTATE=1;
    }
    private void getOnceCode(){
         mProgressDialog = ProgressDialog.show(LoginActivity.this, null, "Get Once Code...", true, true);
        V2EX.getOnceCode(this, "https://www.v2ex.com/signin", new JsonHttpResponseHandler(){
            @Override
            public void onSuccess(int statusCode, cz.msebera.android.httpclient.Header[] headers, JSONObject response) {
                try {
                    if(response.getString("result").equals("ok")){
                        int onceCode = response.getJSONObject("content").getInt("once");
                        LoginFormModel formModel=new LoginFormModel();
                        formModel.setNameKey(response.getJSONObject("content").getString("username"));
                        formModel.setPswKey(response.getJSONObject("content").getString("password"));
                        mProgressDialog.setMessage("Login...");
                        login(onceCode,formModel);
                    }else{
                        Toast.makeText(LoginActivity.this, "get once code fail",Toast.LENGTH_SHORT).show();
                    }
                } catch (JSONException e) {
                    Toast.makeText(LoginActivity.this, "json error",Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }
            }
        });
    }
    private void login(int onceCode, LoginFormModel formModel){
        V2EX.login(LoginActivity.this, usernameString, passwordString,formModel, onceCode, new JsonHttpResponseHandler(){
            @Override
            public void onSuccess(int statusCode,cz.msebera.android.httpclient.Header[] headers, JSONObject response) {
                try {
                    if(response.getString("result").equals("ok")){
                        mProgressDialog.setMessage("Get userinfo...");
                        getUserInfo();
                    }else if(response.getString("result").equals("fail")){
                        String errorContent = response.getJSONObject("content").getString("error_msg");
                        Toast.makeText(LoginActivity.this,errorContent, Toast.LENGTH_SHORT).show();
                        mProgressDialog.dismiss();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    private void getUserInfo(){
        V2EX.getUserInfo(LoginActivity.this, new JsonHttpResponseHandler(){
            @Override
            public void onSuccess(int statusCode, cz.msebera.android.httpclient.Header[] headers, JSONObject response) {
                try{
                    String username = response.getJSONObject("content").getString("username");

                    Toast.makeText(LoginActivity.this, "hello"+username, Toast.LENGTH_SHORT).show();
                    long currentTimeMillis = System.currentTimeMillis();
                    PreferenceManager.getDefaultSharedPreferences(LoginActivity.this).edit()
                            .putString("username", username)
                            .putLong("sync_time", currentTimeMillis)
                            .apply();
                    mProgressDialog.dismiss();

                    finish();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
