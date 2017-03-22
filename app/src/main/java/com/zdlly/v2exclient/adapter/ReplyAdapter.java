package com.zdlly.v2exclient.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.zdlly.v2exclient.R;
import com.zdlly.v2exclient.bean.Reply;

import java.util.List;

/**
 * Created by zdlly on 2017/3/22.
 */

public class ReplyAdapter extends RecyclerView.Adapter<ReplyAdapter.MyViewHolder> {

    private List<Reply> replyList;
    private LayoutInflater layoutInflater;
    private Context context;

    public ReplyAdapter(Context context, List<Reply> replyList) {
        this.replyList = replyList;
        this.context=context;
        layoutInflater = LayoutInflater.from(context);
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.reply_adapter, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Glide.with(context).load("http:"+((replyList.get(position)).getMember().getAvatar_normal())).into(holder.photo);
        holder.name.setText(replyList.get(position).getMember().getUsername());
        holder.reply.setText(replyList.get(position).getContent());
    }


    @Override
    public int getItemCount() {
        return replyList.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView photo;
        TextView name;
        TextView reply;

        public MyViewHolder(View itemView) {
            super(itemView);
            photo= (ImageView) itemView.findViewById(R.id.photo);
            name= (TextView) itemView.findViewById(R.id.name);
            reply= (TextView) itemView.findViewById(R.id.reply);
        }
    }


}
