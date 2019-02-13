package com.test.design.工厂方法模式;

/**
 * Created by admin on 2017/4/22.
 */
public class NvWa {


    public static void main(String[] args) {

        //使用工厂造人
        HumanFactory factory = new HumanFactory();
        // 造白人
        WhiteHuman white = factory.createHuman(WhiteHuman.class);
        white.getColor();
        white.talk();
        // 造黑人
        BlackHuman black =  factory.createHuman(BlackHuman.class);
        black.talk();
        black.getColor();
        //造黄人
        YellowHuman yellowHuman = factory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
        String y = yellowHuman.sayOtherLanage("i am zh-CN");
        System.out.println(y);
    }
}
