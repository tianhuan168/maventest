package com.test.design.迪米特法则;

import java.util.Calendar;

/**
 * Created by admin on 2017/4/15.
 */
// 老师  发布任务
public class Teacher {

    // 发布任务，让班长汇报人数
    int commond(ClassLeader leader){
      return leader.checkCount();
    }
}
