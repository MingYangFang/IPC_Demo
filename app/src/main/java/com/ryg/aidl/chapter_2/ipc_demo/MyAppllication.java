package com.ryg.aidl.chapter_2.ipc_demo;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

public class MyAppllication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        LeakCanary.install(this);



    }
}
