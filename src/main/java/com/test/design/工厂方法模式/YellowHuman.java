package com.test.design.工厂方法模式;

/**
 * Created by admin on 2017/4/22.
 */
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄种人");
    }

    @Override
    public void talk() {
        System.out.println("黄色语");
    }

    public String sayOtherLanage(String words){
        return "can say " + words;
    }
}
