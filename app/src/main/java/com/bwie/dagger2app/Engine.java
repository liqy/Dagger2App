package com.bwie.dagger2app;

import android.util.Log;

public class Engine {

    private String gear;

    public Engine(String gear){
        Log.d(getClass().getSimpleName(),"Create Engine");
        this.gear = gear;
    }
}