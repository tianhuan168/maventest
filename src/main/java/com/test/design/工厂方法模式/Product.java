package com.test.design.工厂方法模式;

/**
 * Created by admin on 2017/4/22.
 */
// 负责定义产品的共性，实现对事物最抽象的定义
public  abstract class Product {

    // 1.产品类的公共方法，可以内部实现
    public void  method1(){
        // do somethings
    }

    // 2 抽象方法
    public abstract void method2();
}
