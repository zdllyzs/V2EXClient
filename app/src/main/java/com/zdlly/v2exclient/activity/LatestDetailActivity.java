package com.zdlly.v2exclient.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.zdlly.v2exclient.R;
import com.zdlly.v2exclient.adapter.ReplyAdapter;
import com.zdlly.v2exclient.bean.Latest;
import com.zdlly.v2exclient.bean.Reply;
import com.zdlly.v2exclient.network.ReplyService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LatestDetailActivity extends AppCompatActivity implements View.OnClickListener, SwipeRefreshLayout.OnRefreshListener, Callback<List<Reply>> {

    private Latest latest;
    private TextView latestDetail;
    private Toolbar toolbar;
    private ImageView photo;
    private TextView name;
    private TextView title;
    private RecyclerView secondReplyRecycler;
    private SwipeRefreshLayout swipe_refresh;
    Call<List<Reply>> call;
    private List<Reply> replyList;
    private ReplyAdapter secondRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latest_detail);
        initData();
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


    }

    private void initData() {
        Intent intent = this.getIntent();
        latest = (Latest) intent.getSerializableExtra("latest");



        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("https://www.v2ex.com/").
                addConverterFactory(GsonConverterFactory.create()).
                build();

        ReplyService service = retrofit.create(ReplyService.class);

        call = service.getreplies(latest.getId());

        call.enqueue(this);

    }

    private void initView() {
        this.setTitle(latest.getTitle());
        latestDetail = (TextView) findViewById(R.id.latestDetail);
        latestDetail.setText(latest.getContent());
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setOnClickListener(this);
        photo = (ImageView) findViewById(R.id.photo);
        photo.setOnClickListener(this);
        name = (TextView) findViewById(R.id.name);
        name.setOnClickListener(this);
        title = (TextView) findViewById(R.id.title);
        title.setOnClickListener(this);
        secondReplyRecycler = (RecyclerView) findViewById(R.id.secondReplyRecycler);
        secondReplyRecycler.setOnClickListener(this);
        swipe_refresh = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh);
        swipe_refresh.setOnRefreshListener(this);

        Glide.with(this).load("http:" + latest.getMember().getAvatar_normal()).into(photo);
        name.setText(latest.getMember().getUsername());
        title.setText(latest.getTitle());
        secondReplyRecycler.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onClick(View v) {
    }

    @Override
    public void onRefresh() {
        call.clone().enqueue(this);
    }

    @Override
    public void onResponse(Call<List<Reply>> call, Response<List<Reply>> response) {
        replyList = response.body();
        if(secondReplyRecycler.getAdapter()==null){
            secondRecyclerAdapter=new ReplyAdapter(this,replyList);
            secondReplyRecycler.setAdapter(secondRecyclerAdapter);
        }else{
            secondRecyclerAdapter.notifyDataSetChanged();
            swipe_refresh.setRefreshing(false);
        }
    }

    @Override
    public void onFailure(Call<List<Reply>> call, Throwable t) {
        Toast.makeText(LatestDetailActivity.this, "读取失败，请检查网络设置", Toast.LENGTH_SHORT).show();
    }
}
