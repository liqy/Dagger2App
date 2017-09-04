package com.mvpexample.app.Login.dagger2;

import com.mvpexample.app.Login.LoginPresenter;
import com.mvpexample.app.Login.LoginPresenterImpl;
import com.mvpexample.app.Login.LoginView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by liqy on 2017/9/4.
 */

@Module
public class LoginModule {

    LoginView loginView;
    String tag;

    public LoginModule(LoginView view,String tag) {
        this.loginView = view;
        this.tag=tag;
    }

    @Provides
    LoginPresenter provideLoginPresenter() {
        return new LoginPresenterImpl(loginView,tag);
    }

}
