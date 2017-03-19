package com.zdlly.v2exclient.network;

import com.zdlly.v2exclient.bean.Hot;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by zdlly on 2017/3/16.
 */

public interface HotService {
    @GET("api/topics/hot.json")
    Call<List<Hot>> getHotLists();
}
