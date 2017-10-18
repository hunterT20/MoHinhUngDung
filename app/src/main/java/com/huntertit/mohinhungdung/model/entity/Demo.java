package com.huntertit.mohinhungdung.model.entity;

/**
 * Created by Nusib on 10/18/2017.
 */

public class Demo {
    private String message;

    public Demo(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "message='" + message + '\'' +
                '}';
    }
}
