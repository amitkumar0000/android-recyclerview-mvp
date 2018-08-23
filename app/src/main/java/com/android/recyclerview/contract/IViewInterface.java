package com.android.recyclerview.contract;

import com.android.recyclerview.view.CustomeAdapter;

public interface IViewInterface {

    void onBindRepositoryView();

    int getRespositoryCount();

    void setPresenterObject(CustomeAdapter customeAdapter);

}
