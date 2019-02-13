package com.test.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by admin on 2017/4/3.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Inheritable {
}
