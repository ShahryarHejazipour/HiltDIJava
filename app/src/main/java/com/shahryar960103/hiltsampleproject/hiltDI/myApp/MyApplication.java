package com.shahryar960103.hiltsampleproject.hiltDI.myApp;


import android.app.Application;
import android.content.Context;

import dagger.hilt.DefineComponent;
import dagger.hilt.android.HiltAndroidApp;
import dagger.hilt.android.components.ApplicationComponent;


@HiltAndroidApp
public class MyApplication extends Application {


    private static Context context;

    public void onCreate() {
        super.onCreate();
        MyApplication.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return MyApplication.context;
    }


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);



        //jlljhl
    }
}
