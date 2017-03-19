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
import com.zdlly.v2exclient.bean.latest;

import java.util.List;

/**
 * Created by zdlly on 2017/3/16.
 */

public class SecondRecyclerAdapter extends RecyclerView.Adapter<SecondRecyclerAdapter.MyViewHolder> {

    private Context context;
    private List<latest> latestList;
    private LayoutInflater layoutInflater;

    public SecondRecyclerAdapter(Context context, List<latest> latestList) {
        this.context = context;
        this.latestList=latestList;
        layoutInflater=LayoutInflater.from(context);
    }



    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view =layoutInflater.inflate(R.layout.first_adapter,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Glide.with(context).load("http:"+((latestList.get(position)).getMember().getAvatar_normal())).into(holder.photo);
        holder.name.setText((latestList.get(position)).getMember().getUsername());
        holder.title.setText((latestList.get(position)).getTitle());
    }


    @Override
    public int getItemCount() {
        return latestList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView photo;
        TextView name;
        TextView title;


        public MyViewHolder(View itemView) {
            super(itemView);
            photo= (ImageView) itemView.findViewById(R.id.photo);
            name= (TextView) itemView.findViewById(R.id.name);
            title= (TextView) itemView.findViewById(R.id.title);
        }
    }
}
