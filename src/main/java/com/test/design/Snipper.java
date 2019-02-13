package com.test.design;

/**
 * Created by admin on 2017/4/14.
 */
public class Snipper  {

    private Aug aug;

    public void setAug(Aug aug) {
        this.aug = aug;
    }

    public void kill(){
        aug.zoomOut();
        aug.shoot();
    }
    public void killBy(Aug aug){
        aug.zoomOut();
        aug.shoot();
    }
}
