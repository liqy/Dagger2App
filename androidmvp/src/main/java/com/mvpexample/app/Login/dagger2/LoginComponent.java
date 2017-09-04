package com.mvpexample.app.Login.dagger2;

import com.mvpexample.app.Login.LoginActivity;

import dagger.Component;

/**
 * Created by liqy on 2017/9/4.
 */
@Component(modules = LoginModule.class)
public interface LoginComponent {
    void inject(LoginActivity activity);
}
