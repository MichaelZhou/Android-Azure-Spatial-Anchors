package com.example.myapplication;

import android.app.Application;
import com.microsoft.CloudServices;

public class MyFirstApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CloudServices.initialize(this);
    }
}
