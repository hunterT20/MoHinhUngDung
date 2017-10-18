package com.huntertit.mohinhungdung.model;

import com.huntertit.mohinhungdung.model.entity.Demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Xử lý dữ liệu và trả về presenter thông qua callback
 */

public class UserInterator {
    private LoadDemoListener listener;

    public UserInterator(LoadDemoListener listener) {
        this.listener = listener;
    }

    //Xử lý tạo dữ liệu
    public void createListData(){
        List<Demo> demoList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            Demo demo = new Demo("I'm developer!");
            demoList.add(demo);
        }
        listener.onLoadDemoSuccess(demoList);
    }
}
