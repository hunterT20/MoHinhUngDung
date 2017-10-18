package com.huntertit.mohinhungdung.presenter;

import android.util.Log;
import android.widget.Toast;

import com.huntertit.mohinhungdung.model.LoadDemoListener;
import com.huntertit.mohinhungdung.model.UserInterator;
import com.huntertit.mohinhungdung.model.entity.Demo;
import com.huntertit.mohinhungdung.view.MainView;

import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Lớp này dùng để xử lý các logic, nhận dữ liệu từ lớp model thông qua các hàm callback
 * nhiệm vụ đẩy lên view hướng dẫn cách View hiên thị
 */

public class MainPresenter implements LoadDemoListener{
    private UserInterator userInterator;
    private MainView mainView;

    public MainPresenter(MainView mainView) {
        userInterator = new UserInterator(this);
        this.mainView = mainView;
    }

    public void loadData(){
        userInterator.createListData();
    }

    @Override
    public void onLoadDemoSuccess(List<Demo> demoList) {
        mainView.displayMain(demoList);
    }

    @Override
    public void onLoadDemoFailure(String message) {
        Log.e(TAG, "onLoadDemoFailure: " + message);
    }
}
