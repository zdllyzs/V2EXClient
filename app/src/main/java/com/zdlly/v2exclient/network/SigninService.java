package com.zdlly.v2exclient.network;

import android.database.Observable;

import java.util.HashMap;

import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by zdlly on 2017/3/30.
 */

public interface SigninService {

    /**
     * 登录
     *
     * @return
     */
    @FormUrlEncoded
    @POST("/signin")
    Observable<String> login(@FieldMap HashMap<String, String> hashMap);
}
