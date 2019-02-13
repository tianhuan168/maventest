package com.test.Interceptor;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

/**
 * Created by admin on 2017/4/4.
 * 第二种方式是实现Spring的WebRequestInterceptor接口，或者是继承实现了WebRequestInterceptor的类。
 */
public class AllInterceptor implements WebRequestInterceptor{
    @Override
    public void preHandle(WebRequest request) throws Exception {
        System.out.println("AllInterceptor...............................");
        request.setAttribute("request", "request", WebRequest.SCOPE_REQUEST);//这个是放到request范围内的，所以只能在当前请求中的request中获取到
        request.setAttribute("session", "session", WebRequest.SCOPE_SESSION);//这个是放到session范围内的，如果环境允许的话它只能在局部的隔离的会话中访问，否则就是在普通的当前会话中可以访问
        request.setAttribute("globalSession", "globalSession", WebRequest.SCOPE_GLOBAL_SESSION);//如果环境允许的话，它能在全局共享的会话中访问，否则就是在普通的当前会话中访问
    }

    @Override
    public void postHandle(WebRequest request, ModelMap map) throws Exception {
        System.out.println("AllInterceptor postHandle ");
    }

    @Override
    public void afterCompletion(WebRequest request, Exception ex) throws Exception {
        System.out.println(ex + "-=-=--=--=-=-=-=-=-=-=-=-==-=--=-=-=-=");
    }
}
