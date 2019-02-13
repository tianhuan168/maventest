package com.test.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * Created by admin on 2017/3/26.
 */
public class TianhuanWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected String[] getServletMappings(){ //DispatcherServlet映射,从"/"开始
        return new String[]{"/"};
    }

    @Override
    protected Class<?>[] getRootConfigClasses(){//根容器
        return new Class<?>[] {RootConfig.class,PropConfig.class,SessionFactoryConfig.class,RedisCacheConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses(){//Spring mvc容器
        return new Class<?>[] {WebMvcConfig.class};
    }


    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        return new Filter[] {characterEncodingFilter};
    }
}
