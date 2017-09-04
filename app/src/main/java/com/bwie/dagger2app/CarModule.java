package com.bwie.dagger2app;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by liqy on 2017/9/4.
 */


@Module
public class CarModule {
    public CarModule() {
    }


    @CarScope
    @Provides
    Engine provideEngine(){
        return new Engine("保时捷");
    }

}
