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
import com.zdlly.v2exclient.bean.Hot;
import com.zdlly.v2exclient.listener.OnItemClickListener;

import java.util.List;

/**
 * Created by zdlly on 2017/3/16.
 */

public class FirstRecyclerAdapter extends RecyclerView.Adapter<FirstRecyclerAdapter.MyViewHolder> {

    private Context context;
    private List<Hot> hotList;
    private LayoutInflater layoutInflater;



    private OnItemClickListener listener;


    public void setListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public FirstRecyclerAdapter(Context context, List<Hot> hotList) {
        this.context = context;
        this.hotList = hotList;
        layoutInflater=LayoutInflater.from(context);
    }



    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view =layoutInflater.inflate(R.layout.first_adapter,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Glide.with(context).load("http:"+((hotList.get(position)).getMember().getAvatar_normal())).into(holder.photo);
        holder.name.setText((hotList.get(position)).getMember().getUsername());
        holder.title.setText((hotList.get(position)).getTitle());
    }


    @Override
    public int getItemCount() {
        return hotList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView photo;
        TextView name;
        TextView title;


        public MyViewHolder(View itemView) {
            super(itemView);
            photo= (ImageView) itemView.findViewById(R.id.photo);
            name= (TextView) itemView.findViewById(R.id.name);
            title= (TextView) itemView.findViewById(R.id.title);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if(listener!=null){
                listener.onItemClick(v);
            }
        }
    }
}
