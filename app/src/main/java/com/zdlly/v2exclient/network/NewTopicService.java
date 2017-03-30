package com.zdlly.v2exclient.network;

import android.database.Observable;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by zdlly on 2017/3/30.
 */

public interface NewTopicService {
    /**
     *
     *
     * @param title
     * @param content
     * @param node_name
     * @param once
     * @return
     */
    @FormUrlEncoded
    @POST("/new")
    Observable<String> newTopic(@Field("title") String title, @Field("content") String content, @Field("node_name") String node_name, @Field("once") String once);

}
