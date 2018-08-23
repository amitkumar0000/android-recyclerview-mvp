package com.android.recyclerview.contract;


import java.util.List;

import com.android.recyclerview.model.UserContent;

public interface IPresenterInterface {
    void notifyDataChange(List<UserContent> contentList);
}
