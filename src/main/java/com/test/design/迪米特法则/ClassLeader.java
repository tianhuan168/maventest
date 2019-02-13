package com.test.design.迪米特法则;

import java.util.List;

/**
 * Created by admin on 2017/4/15.
 */
// 班长 负责执行老师的指令,汇报人数
public class ClassLeader {
    List<Student> list;
    ClassLeader( List<Student> students){
        this.list = students;
    }

    int checkCount(){
        return list.size();
    }
}
