package com.test.design.依赖倒置原则;

/**
 * Created by admin on 2017/4/15.
 */
// 司机
public class Driver {
    // 开车

    void driver(AbsCar absCar){
        System.out.println("司机进场");
        absCar.run();
    }

}
