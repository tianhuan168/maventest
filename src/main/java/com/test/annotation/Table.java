package com.test.annotation;

import java.lang.annotation.*;

/**
 * Created by admin on 2017/4/3.
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Table {

}
