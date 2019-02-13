package com.test.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by admin on 2017/3/26.
 */
@Configuration
@EnableTransactionManagement

public class DataConfig {

//    @Bean(name = "dataSource", initMethod = "init", destroyMethod = "close")
//    public DataSource dataSource() {
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://123.57.238.249:3306/lexun?useUnicode=true&characterEncoding=utf-8");
//        dataSource.setUsername("dev");
//        dataSource.setPassword("dev123");
//        dataSource.setInitialSize(5);
//        dataSource.setMaxActive(10);
//        return dataSource;
//    }

}
