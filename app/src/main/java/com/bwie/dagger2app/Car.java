package com.bwie.dagger2app;

import javax.inject.Inject;

public class Car {

    @Inject
    Engine engineA;
    @Inject
    Engine engineB;

    public Car() {
        DaggerCarComponent.builder()
                .carModule(new CarModule())
                .build()
                .inject(this);
    }
}