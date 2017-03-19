package com.zdlly.v2exclient.network;

import com.zdlly.v2exclient.bean.hot;
import com.zdlly.v2exclient.bean.latest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by zdlly on 2017/3/19.
 */

public interface LatestService {
    @GET("api/topics/latest.json")
    Call<List<latest>> getLatestLists();
}
