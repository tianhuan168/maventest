package com.test.config;

import com.test.Interceptor.AllInterceptor;
import com.test.Interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Created by admin on 2017/3/26.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.test.controller")
public class WebMvcConfig extends WebMvcConfigurerAdapter{
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resolver =
                new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        resolver.setExposeContextBeansAsAttributes(true);

        return resolver;
    }

    @Override
    public void configureDefaultServletHandling(
            DefaultServletHandlerConfigurer configurer){
        configurer.enable();//配置静态文件处理
    }

    // 添加拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addWebRequestInterceptor(new AllInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**");
    }

}
