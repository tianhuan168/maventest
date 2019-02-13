package com.test.design;

/**
 * Created by admin on 2017/4/14.
 */
public class Aug extends RifleGun {

    // 给狙击枪一个瞄准镜
    void zoomOut(){
        System.out.println("通过望远镜观察敌人");
    }

    @Override
    void shoot() {
        System.out.println("AUG狙击步枪开始射击");
    }
}
