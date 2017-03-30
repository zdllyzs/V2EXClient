package com.zdlly.v2exclient.network;

import android.database.Observable;

import java.util.HashMap;

import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by zdlly on 2017/3/30.
 */

public interface CommentService {
    /**
     * 发表评论
     *
     * @param path
     * @param comment
     * @return
     */
    @FormUrlEncoded
    @POST("/t/{path}")
    Observable<String> sendComment(@Path("path") String path, @FieldMap HashMap<String, String> comment);
}
