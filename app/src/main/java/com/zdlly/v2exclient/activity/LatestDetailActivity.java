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
import com.zdlly.v2exclient.bean.Latest;

public class LatestDetailActivity extends AppCompatActivity {

    private Latest latest;
    private TextView latestDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latest_detail);
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
        latest = (Latest) intent.getSerializableExtra("latest");

        latestDetail.setText(latest.getContent());
    }

    private void initView() {
        latestDetail = (TextView) findViewById(R.id.latestDetail);
    }
}
