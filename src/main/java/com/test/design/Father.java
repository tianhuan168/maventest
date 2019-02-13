package com.test.design;

import java.util.Collection;
import java.util.HashMap;

/**
 * Created by admin on 2017/4/14.
 */
public class Father {


    public Collection doSomethings(HashMap map){
        System.out.println("Father --->");
        return map.values();
    }
}
