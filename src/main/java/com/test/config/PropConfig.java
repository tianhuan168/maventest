package com.test.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by admin on 2017/3/26.
 */
@Configuration
@PropertySource("classpath:config.properties")
public class PropConfig {

    @Value("${sex:true}")
    private Boolean result;

    @Value("${name:mawenjing}")
    private String name;

    @Value("${age:11}")
    private String age;

    @Value("${jdbc.driverClassName}")
    private String DriverClassName;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username:dev}")
    private String username;

    @Value("${jdbc.password:dev123}")
    private String password;
    @Value("${redis.host:127.0.0.1}")
    private String redisHost;
    @Value("${redis.port:6379}")
    private String redisPort;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDriverClassName() {
        return DriverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        DriverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public String getRedisHost() {
        return redisHost;
    }

    public void setRedisHost(String redisHost) {
        this.redisHost = redisHost;
    }

    public String getRedisPort() {
        return redisPort;
    }

    public void setRedisPort(String redisPort) {
        this.redisPort = redisPort;
    }
}
