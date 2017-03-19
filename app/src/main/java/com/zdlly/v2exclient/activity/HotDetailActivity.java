package com.zdlly.v2exclient.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.zdlly.v2exclient.R;
import com.zdlly.v2exclient.bean.Hot;

public class HotDetailActivity extends AppCompatActivity {

    private Hot hot;
    private TextView hotDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_detail);
        initView();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "评论功能尚未完成", Snackbar.LENGTH_LONG)
                        .setAction("回复", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        }).show();
            }
        });
        initData();
    }

    private void initData() {
        Intent intent = this.getIntent();
        hot = (Hot) intent.getSerializableExtra("Hot");

        hotDetail.setText(hot.getContent());
    }

    private void initView() {
        hotDetail = (TextView) findViewById(R.id.hotDetail);
    }
}
