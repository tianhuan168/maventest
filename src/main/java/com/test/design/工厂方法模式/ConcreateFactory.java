package com.test.design.工厂方法模式;

/**
 * Created by admin on 2017/4/22.
 */
public class ConcreateFactory extends CreateFactory {

    // 创建实例 并返回
    @Override
    public <T extends Product> T createProduct(Class<T> T) {
        Product product = null;

        try {
            product = (T) Class.forName(T.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return (T) product;
    }
}
