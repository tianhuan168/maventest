package com.test.asm;

/**
 * Created by admin on 2017/6/13.
 *
 *  要修改的方法中，准备添加的我们自己的代码逻辑
 */
public class AopInteceptor {

    public static void before(){
        System.out.println(".......before().......");
    }

    public static void after(){
        System.out.println(".......after().......");
    }
}
