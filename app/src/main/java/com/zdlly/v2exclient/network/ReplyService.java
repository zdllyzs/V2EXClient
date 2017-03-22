package com.zdlly.v2exclient.network;

import com.zdlly.v2exclient.bean.Reply;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by zdlly on 2017/3/22.
 */

public interface ReplyService {
    @GET("api/replies/show.json")
    Call<List<Reply>> getreplies(@Query("topic_id") int id);
}
