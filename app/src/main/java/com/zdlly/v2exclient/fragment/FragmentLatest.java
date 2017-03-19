package com.zdlly.v2exclient.fragment;


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
import com.zdlly.v2exclient.adapter.SecondRecyclerAdapter;
import com.zdlly.v2exclient.bean.latest;
import com.zdlly.v2exclient.network.LatestService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FragmentLatest extends Fragment implements Callback<List<latest>>, SwipeRefreshLayout.OnRefreshListener {
    private RecyclerView secondRecycler;
    private List<latest> latestList;
    private SwipeRefreshLayout swipeRefresh;


    Retrofit retrofit = new Retrofit.Builder().
            baseUrl("https://www.v2ex.com/").
            addConverterFactory(GsonConverterFactory.create()).
            build();

    LatestService service=retrofit.create(LatestService.class);

    Call<List<latest>> call=service.getLatestLists();

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
    public void onResponse(Call<List<latest>> call, Response<List<latest>> response) {
        latestList = response.body();
        if(secondRecycler.getAdapter()==null)
            secondRecycler.setAdapter(new SecondRecyclerAdapter(getContext(),latestList));
        else {
            secondRecycler.getAdapter().notifyDataSetChanged();
            swipeRefresh.setRefreshing(false);
        }
    }

    @Override
    public void onFailure(Call<List<latest>> call, Throwable t) {
        Toast.makeText(getContext(), "读取失败，请检查网络设置", Toast.LENGTH_SHORT).show();
    }
}
