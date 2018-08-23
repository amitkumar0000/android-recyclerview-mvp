package com.android.recyclerview.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.android.recyclerview.R;
import com.android.recyclerview.presenter.UserPresenter;


public class MainActivity extends AppCompatActivity {

    RecyclerView userList;
    CustomeAdapter customeAdapter;
    RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userList = findViewById(R.id.usrlist);
        customeAdapter = new CustomeAdapter(new UserPresenter());
        layoutManager = new LinearLayoutManager(this);
        userList.setLayoutManager(layoutManager);
        userList.setAdapter(customeAdapter);
    }
}
