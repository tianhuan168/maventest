package com.test.service;

import com.alibaba.fastjson.JSONObject;
import com.test.entity.Area;
import com.test.entity.User;
import com.test.mapper.JobMapper;
import com.test.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2017/3/26.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private  JobMapper jobMapper;
    @Override
    public void sayHello() {
        User u = new User();
        u.setId(1);
        u.setAge(11);
        u.setName("tianhuan");
        System.out.println(JSONObject.toJSONString(u));
    }

    @Override
    public String findAll() {
         List<User> list = userMapper.getUserList();
         List<Area> la =jobMapper.findAll();
        return JSONObject.toJSONString(list) + "--" + JSONObject.toJSONString(la);
    }

    @Override
    public User findById(int userId) {
        return userMapper.getUserById(userId);
    }
}
