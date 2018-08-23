package com.android.recyclerview.view;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.recyclerview.R;
import com.android.recyclerview.contract.IPresenterInterface;
import com.android.recyclerview.contract.IViewInterface;
import com.android.recyclerview.model.UserContent;

import java.util.List;

public class CustomeAdapter extends RecyclerView.Adapter<MyViewHolder> implements IPresenterInterface{

    IViewInterface presenter;
    List<UserContent> userContents;
    public CustomeAdapter(IViewInterface presenter){
        this.presenter = presenter;
        presenter.setPresenterObject(this);
        presenter.onBindRepositoryView();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.usercontent,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {
        if(userContents!=null) {
            UserContent content = userContents.get(position);
            myViewHolder.getUserImg().setImageResource(content.getImageSrc());
            myViewHolder.getNameText().setText(content.getName());
            myViewHolder.getDescText().setText(content.getDesc());
            myViewHolder.getTimeText().setText(content.getTime());
        }
    }

    @Override
    public int getItemCount() {
        return presenter.getRespositoryCount();
    }

    @Override
    public void notifyDataChange(List<UserContent> content) {
        userContents = content;
        notifyDataSetChanged();
    }
}

