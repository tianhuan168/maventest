package com.test.design.工厂方法模式;

/**
 * Created by admin on 2017/4/22.
 */
public abstract class AbstractHumanFactory {

    // 制造人
    public abstract <T extends Human> T  createHuman(Class<T> c);

    public void defaultT(){
        System.out.println("default~~");
    }

}
