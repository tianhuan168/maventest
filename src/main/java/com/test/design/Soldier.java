package com.test.design;

/**
 * Created by admin on 2017/4/14.
 */
// 士兵 操作类
public class Soldier {

    private AbstractGun abstractGun;

    public void setAbstractGun(AbstractGun abstractGun) {
        this.abstractGun = abstractGun;
    }

    // 射击
    void killEnmey(){
        abstractGun.shoot();
    }
}
