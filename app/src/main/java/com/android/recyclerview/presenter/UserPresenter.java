package com.android.recyclerview.presenter;

import com.android.recyclerview.R;
import com.android.recyclerview.contract.IViewInterface;
import com.android.recyclerview.model.UserContent;
import com.android.recyclerview.view.CustomeAdapter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class UserPresenter implements IViewInterface {

    private  List<UserContent> repositories;

    CustomeAdapter customeAdapter;

    public UserPresenter(){
        UserContent content = new UserContent.Builder()
                            .setName("Amit")
                            .setDesc("Ola Employee")
                            .setTime(String.valueOf(new SimpleDateFormat("HH:mm:ss").format(new Date())))
                            .setImageSrc(R.mipmap.ic_launcher_round)
                            .build();
        repositories  = new LinkedList<>();
        repositories.add(content);
    }





    @Override
    public void onBindRepositoryView() {
        customeAdapter.notifyDataChange(repositories);

    }

    @Override
    public int getRespositoryCount() {
        return repositories.size();
    }

    @Override
    public void setPresenterObject(CustomeAdapter customeAdapter) {
        this.customeAdapter = customeAdapter;
    }


}
