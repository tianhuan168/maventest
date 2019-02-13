package com.test.design.单粒模式;

/**
 * Created by admin on 2017/4/16.
 */
public class 单例模式 {

    /**
     * 单粒模式
     * 确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例
     * 并且该类的所有方法推荐都是static的
     *
     * 优点：
     * 1.内存只有一个对象，内存开销非常小，特别是针对一个对象创建销毁比较频繁
     * 2.减少系统开销，适用于资源文件配置，其他启动时候依赖对象时候，读取后永驻内存
     * 3.避免对资源的多重利用，有效避免多线程问题
     * 4.可以设置全局的访问点，优化和共享资源访问
     *
     * 缺点
     * 1.一般没有接口，不易扩展，因为其提供的实例是自行生产的，方法有基本都是static的，
     * 2.不易于测试，测试是基于各种结果来实现下一步
     * 3.违背单一原则
     *
     * 一般的使用场景
     * 1.要求生成唯一序列号的场景
     * 2.在整个项目中需要一个共享的访问点或者数据。比如获取计数器
     * 3.创建一个新的对象小号的资源过度，比如访问IO和db资源
     * 4.需要定义大量的静态常量和静态方法（工具类）、资源文件读取
     *
     * 注意事项
     * 高并发情况下，注意线程同步问题。
     */
}
