package com.test.design;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2017/4/15.
 */
public class Son  extends  Father{


    // 方法的重载（overload） 方法名可以完全一致，参数可以自行定义
    public Collection doSomethings(Map map) {
        System.out.println("Son --->");
        return map.values();
    }
}
