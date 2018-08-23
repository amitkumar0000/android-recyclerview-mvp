package com.android.recyclerview.view;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.recyclerview.R;


public class MyViewHolder extends RecyclerView.ViewHolder{
    ImageView userImg;
    TextView nameText;
    TextView descText;
    TextView timeText;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        userImg = itemView.findViewById(R.id.userImage);
        nameText = itemView.findViewById(R.id.userName);
        descText = itemView.findViewById(R.id.userDesc);
        timeText = itemView.findViewById(R.id.time);
    }

    public ImageView getUserImg() {
        return userImg;
    }

    public TextView getNameText() {
        return nameText;
    }

    public TextView getDescText() {
        return descText;
    }

    public TextView getTimeText() {
        return timeText;
    }
}
