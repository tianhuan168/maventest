package com.test.controller;

import com.test.annotation.Inheritable;
import com.test.annotation.UnInheritable;

import java.util.Arrays;

/**
 * Created by admin on 2017/4/3.
 */
public class TestAno {

    @UnInheritable
    @Inheritable
    public static class Super{
    }

    public static class Sub extends  Super {

    }

    public static void main(String[] args) {

        Super instance = new Sub();
        System.out.println(Arrays.toString(instance.getClass().getDeclaredAnnotations()));
    }


}
