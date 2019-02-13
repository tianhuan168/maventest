package com.test.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;

/**
 * Created by admin on 2017/3/26.
 */
@Configuration
@EnableTransactionManagement
@ComponentScan(
        basePackages = {"com.test"},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)})
public class SessionFactoryConfig implements TransactionManagementConfigurer {


    @Bean(name = "dataSource")
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://123.57.238.249:3306/lexun?useUnicode=true&characterEncoding=utf-8");
        dataSource.setUsername("dev");
        dataSource.setPassword("dev123");
        dataSource.setInitialSize(5);
        dataSource.setMaxActive(10);
        return dataSource;
    }


    /**
     * mybatis 配置路径
     */
   // private static String MYBATIS_CONFIG = "mybatis-config.xml";
    private static String MAPPER_XML = "com.test.mapper.*.xml";
    private String typeAliasPackage = "com.xxx.xxx.mybati.model";

    /**
     * 创建sqlSessionFactoryBean 实例
     * 并且设置configtion 如驼峰命名.等等
     * 设置mapper 映射路径
     * 设置datasource数据源
     *
     * @return
     * @throws Exception
     */
    @Bean(name = "sqlSessionFactory")
        public SqlSessionFactoryBean createSqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        /** 设置mybatis configuration 扫描路径 */
      //  sqlSessionFactoryBean.setConfigLocation(new ClassPathResource(MYBATIS_CONFIG));
        /** 设置datasource */
        sqlSessionFactoryBean.setDataSource(this.dataSource());
        /** 设置typeAlias 包扫描路径 */
        sqlSessionFactoryBean.setTypeAliasesPackage(typeAliasPackage);
      //  sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
        return sqlSessionFactoryBean;
    }


    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean
    public MapperScannerConfigurer createMapperScannerConfigurer()throws Exception{
        MapperScannerConfigurer scannerConfigurer = new MapperScannerConfigurer();
        scannerConfigurer.setBasePackage("com.test.mapper");
        scannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        return  scannerConfigurer;
    }


    @Bean
    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return new DataSourceTransactionManager(this.dataSource());
    }
}
