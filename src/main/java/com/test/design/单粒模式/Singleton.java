package com.test.design.单粒模式;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * Created by admin on 2017/4/16.
 */

public class Singleton {

    // 构造函数 防止new实例化
    private Singleton() {
    }

//    // 饱汉式,非线程安全  当一个线程执行到singleton = new Singleton()时候，另一个线程singleton == null执行到改行依然成立
//    // 所以会产生两个实例
//    private static Singleton singleton = null;
//
//
//    public static Singleton getSingleton(){
//        if (singleton == null){
//            singleton = new Singleton();
//        }
//        return  singleton;
//    }

    // 定义一个SingletonTest类型的变量（不初始化，注意这里没有使用final关键字）
//    private static Singleton instance = null;
//
//    // 定义一个静态的方法（调用时再初始化SingletonTest，使用synchronized 避免多线程访问时，可能造成重的复初始化问题）
//    public static synchronized Singleton getInstance(){
//        if (instance == null) new Singleton();
//        return instance;
//    }

    // 定义一个静态私有变量(不初始化，不使用final关键字，
// 使用volatile保证了多线程访问时instance变量的可见性，避免了instance初始化时其他变量属性还没赋值完时，被另外线程调用)
    private static volatile Singleton instance = null;

//    // 获取实例
//    public static Singleton getInstance() {
//        if (instance == null) {
//            //同步代码块（对象未初始化时，使用同步代码块，保证多线程访问时对象在第一次创建后，不再重复被创建）
//            synchronized (Singleton.class) {
//                if (instance == null)
//                    instance = new Singleton();
//            }
//        }
//        return instance;
//    }

    //内部静态类
    private static  class SingletonHolder{
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
//        注解：定义一个私有的内部类，在第一次用这个嵌套类时，会创建一个实例。
//          而类型为SingletonHolder的类，只有在Singleton.getInstance()中调用，
//          由于私有的属性，他人无法使用SingleHolder，不调用Singleton.getInstance()就不会创建实例。
//        优点：达到了lazy loading的效果，即按需创建实例。
        return SingletonHolder.instance;
    }



//    //反射会使得单例实效
//
//    public static void main(String[] args) {
//        try {
//            Singleton instance1 = Singleton.class.newInstance();
//            Singleton instance2 = Singleton.getInstance();
//            System.out.println(instance1);
//            System.out.println(instance2);
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//    }
}//instace1、instance2的地址是不一样的，是两个对象

