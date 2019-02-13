package com.test.config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by admin on 2017/3/26.
 */

@Configuration
@ComponentScan(
        basePackages={"com.test"},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)})

public class RootConfig {
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
