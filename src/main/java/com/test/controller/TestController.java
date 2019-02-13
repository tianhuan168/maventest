package com.test.controller;

import com.alibaba.fastjson.JSONObject;
import com.test.config.PropConfig;
import com.test.entity.User;
import com.test.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by admin on 2017/3/26.
 */
@Controller
@RequestMapping("/")
public class TestController {
    private static Logger logger = Logger.getLogger(TestController.class);
    @Autowired
    private UserService userService;

    @Autowired
    private PropConfig config;

    @Autowired
    private RedisTemplate template;

    @RequestMapping(value = "test")
    @ResponseBody
    public String home() {

        userService.sayHello();
        userService.noSayAnything();
        User user = userService.findById(1);
        logger.info("msg=" + JSONObject.toJSONString(user));
        System.out.println(config.getResult());

        template.boundHashOps("test").put("name", "tianhuan");
        template.boundHashOps("test").put("age", "123");
        System.out.println(JSONObject.toJSONString(template.opsForHash().keys("test")));
        System.out.println(JSONObject.toJSONString(template.opsForHash().get("test", "name")));
        return userService.findAll();
    }

    @RequestMapping(value = "/q/{token}")
    public Object test1(@PathVariable String token){
        System.out.println("token~~~~~~~~~");
        return "redirect:"+"https://www.baidu.com";
    }

    @RequestMapping(value = "/q/{token}/{app}")
    @ResponseBody
    public Object test2(@PathVariable String token,
                        @PathVariable String app){
        System.out.println("app~~~~");
        return app;
    }

}
