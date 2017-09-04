package com.bwie.dagger2app;

import dagger.Component;

/**
 * Created by liqy on 2017/9/4.
 */

@CarScope
@Component(modules = CarModule.class)
public interface CarComponent {
    void inject(Car car);
}
