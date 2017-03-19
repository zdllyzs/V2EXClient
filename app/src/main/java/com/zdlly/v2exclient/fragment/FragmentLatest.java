package com.zdlly.v2exclient.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.zdlly.v2exclient.R;
import com.zdlly.v2exclient.activity.LatestDetailActivity;
import com.zdlly.v2exclient.adapter.SecondRecyclerAdapter;
import com.zdlly.v2exclient.bean.Latest;
import com.zdlly.v2exclient.listener.OnItemClickListener;
import com.zdlly.v2exclient.network.LatestService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FragmentLatest extends Fragment implements Callback<List<Latest>>, SwipeRefreshLayout.OnRefreshListener, OnItemClickListener {
    private RecyclerView secondRecycler;
    private List<Latest> latestList;
    private SwipeRefreshLayout swipeRefresh;
    private SecondRecyclerAdapter secondRecyclerAdapter;


    Retrofit retrofit = new Retrofit.Builder().
            baseUrl("https://www.v2ex.com/").
            addConverterFactory(GsonConverterFactory.create()).
            build();

    LatestService service=retrofit.create(LatestService.class);

    Call<List<Latest>> call=service.getLatestLists();

    public FragmentLatest() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initData();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_latest, container, false);
        secondRecycler = (RecyclerView) view.findViewById(R.id.secondRecycler);
        secondRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        initView(view);
        return view;

    }

    private void initData() {
        call.enqueue(this);
    }
    private void initView(View view) {
        swipeRefresh = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh);

        swipeRefresh.setColorSchemeResources(R.color.red,R.color.blue,R.color.green,R.color.orange);

        swipeRefresh.setOnRefreshListener(this);

    }

    @Override
    public void onRefresh() {

        call.clone().enqueue(this);
    }

    @Override
    public void onResponse(Call<List<Latest>> call, Response<List<Latest>> response) {
        latestList = response.body();
        if(secondRecycler.getAdapter()==null) {
            secondRecyclerAdapter = new SecondRecyclerAdapter(getContext(), latestList);
            secondRecycler.setAdapter(secondRecyclerAdapter);
            secondRecyclerAdapter.setListener(this);
        }
        else {
            secondRecycler.getAdapter().notifyDataSetChanged();
            swipeRefresh.setRefreshing(false);
        }
    }

    @Override
    public void onFailure(Call<List<Latest>> call, Throwable t) {
        Toast.makeText(getContext(), "读取失败，请检查网络设置", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItemClick(View view) {
        int position=secondRecycler.getChildAdapterPosition(view);
        Intent latestDetailIntent=new Intent(getContext(), LatestDetailActivity.class);
        Bundle latestDetailBundle=new Bundle();
        latestDetailBundle.putSerializable("latest",latestList.get(position));
        latestDetailIntent.putExtras(latestDetailBundle);
        startActivity(latestDetailIntent);
    }
}
