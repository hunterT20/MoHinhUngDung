package com.huntertit.mohinhungdung.model;

import com.huntertit.mohinhungdung.model.entity.Demo;

import java.util.List;

/**
 * callback cho lớp model
 */

public interface LoadDemoListener {
    void onLoadDemoSuccess(List<Demo> demoList);
    void onLoadDemoFailure(String message);
}
