package com.test.design.工厂方法模式;

/**
 * Created by admin on 2017/4/22.
 */
// 抽象工厂类
    // 负责定义产品对象的产生。
public abstract class CreateFactory {

    // 根据传入制定参数 创建产品

    public abstract <T extends Product> T createProduct(Class<T> T);
}
