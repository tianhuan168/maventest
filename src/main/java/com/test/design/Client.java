package com.test.design;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2017/4/14.
 */
public class Client {

    public  static void invoker(){
//        Father f = new Father();
//        HashMap map = new HashMap();
//        map.put("1",123);
//        f.doSomethings(map);
//
//        map.forEach((k,v)-> System.out.println(k + "\t" + v) );

        Son s = new Son();
        HashMap m = new HashMap();
        s.doSomethings(m);
        s.doSomethings(m);
    }

    public static void main(String[] args) {

/*
        Soldier soldier = new Soldier();
        soldier.setAbstractGun(new HandGun());
        soldier.killEnmey();
*/

//        Snipper snipper = new Snipper();
//        snipper.setAug(new Aug());
//        snipper.kill();
    invoker();

    }
}
