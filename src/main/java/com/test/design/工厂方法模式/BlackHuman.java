package com.test.design.工厂方法模式;

/**
 * Created by admin on 2017/4/22.
 */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑人~~~~");
    }

    @Override
    public void talk() {
        System.out.println("说黑人话");
    }
}
