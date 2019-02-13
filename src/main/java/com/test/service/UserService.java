package com.test.service;

import com.test.entity.User;

import java.util.List;

/**
 * Created by admin on 2017/3/26.
 */
public interface UserService {

    default void noSayAnything(){
        System.out.println("i am default");
    }

    void sayHello();

    String findAll();

    User findById(int userId);
}
