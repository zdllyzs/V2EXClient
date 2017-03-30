package com.zdlly.v2exclient.network;

import android.database.Observable;

import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by zdlly on 2017/3/30.
 */

public interface CommentOnceService {
    /**
     * 获取发表评论的once字符串
     *
     * @return
     */
    @GET("/t/{path}")
    Observable<String> getCommentOnce(@Path("path") String path);
}
