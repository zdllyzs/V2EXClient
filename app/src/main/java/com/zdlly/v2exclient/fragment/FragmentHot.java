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
import com.zdlly.v2exclient.activity.HotDetailActivity;
import com.zdlly.v2exclient.adapter.FirstRecyclerAdapter;
import com.zdlly.v2exclient.bean.hot;
import com.zdlly.v2exclient.listener.OnItemClickListener;
import com.zdlly.v2exclient.network.HotService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class FragmentHot extends Fragment implements Callback<List<hot>>, SwipeRefreshLayout.OnRefreshListener, OnItemClickListener {
    private RecyclerView firstRecycler;
    private List<hot> hotList;
    private SwipeRefreshLayout swipeRefresh;
    private FirstRecyclerAdapter firstRecyclerAdapter;

    Retrofit retrofit = new Retrofit.Builder().
            baseUrl("https://www.v2ex.com/").
            addConverterFactory(GsonConverterFactory.create()).
            build();

    HotService service = retrofit.create(HotService.class);
    Call<List<hot>> call = service.getHotLists();

    public FragmentHot() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initData();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hot, container, false);
        firstRecycler = (RecyclerView) view.findViewById(R.id.firstRecycler);
        firstRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        initView(view);
        return view;

    }

    private void initData() {
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<List<hot>> call, Response<List<hot>> response) {
        hotList = response.body();
        if(firstRecycler.getAdapter()==null){
            firstRecyclerAdapter=new FirstRecyclerAdapter(getContext(), hotList);
            firstRecycler.setAdapter(firstRecyclerAdapter);
            firstRecyclerAdapter.setListener(this);
        }
        else {
            firstRecycler.getAdapter().notifyDataSetChanged();
            swipeRefresh.setRefreshing(false);
        }
    }

    @Override
    public void onFailure(Call<List<hot>> call, Throwable t) {
        Toast.makeText(getContext(), "读取失败，请检查网络设置", Toast.LENGTH_SHORT).show();
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
    public void onItemClick(View view) {
        int position=firstRecycler.getChildAdapterPosition(view);
        Intent hotDetailIntent=new Intent(getContext(), HotDetailActivity.class);
        Bundle hotDetailBundle=new Bundle();
        hotDetailBundle.putSerializable("hot",hotList.get(position));
        hotDetailIntent.putExtras(hotDetailBundle);
        startActivity(hotDetailIntent);
    }
}
