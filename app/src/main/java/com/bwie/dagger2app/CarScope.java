package com.bwie.dagger2app;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by liqy on 2017/9/4.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface CarScope {

}
