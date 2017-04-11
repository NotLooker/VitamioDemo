package com.example.admin.myapplication;

import android.app.Application;
import android.media.MediaPlayer;

import io.vov.vitamio.Vitamio;

/**
 * Created by WH675 on 2017/4/11.
 */

public class MyApplication extends Application {
    private static MyApplication instance = null;

    private MediaPlayer mediaPlayer;

    public static MyApplication getInstance(){
        return  instance ;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        Vitamio.isInitialized(getApplicationContext());
    }

}
