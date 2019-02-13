package com.test.design.迪米特法则;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by admin on 2017/4/15.
 */
public class Main {


    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        for (int i = 0; i <= 3; i++) {
            list.add(new Student());
        }

        Teacher teacher = new Teacher();

        ClassLeader leader = new ClassLeader(list);

        int i = teacher.commond(leader);
        System.out.println(i);
    }
}
