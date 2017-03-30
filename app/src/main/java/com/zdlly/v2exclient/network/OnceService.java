package com.zdlly.v2exclient.network;

import android.database.Observable;

import retrofit2.http.GET;

/**
 * Created by zdlly on 2017/3/30.
 */

public interface OnceService {
    /**
     * 获取once字符串
     *
     * @return
     */
    @GET("/signin")
    Observable<String> getOnceString();

}
