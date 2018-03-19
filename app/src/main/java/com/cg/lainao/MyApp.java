package com.cg.lainao;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * MyApp
 * Created by Administrator on 2018/3/17 0017.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
