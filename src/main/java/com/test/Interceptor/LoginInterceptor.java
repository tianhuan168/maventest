package com.test.Interceptor;

import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by admin on 2017/4/4.
 */
public class LoginInterceptor extends HandlerInterceptorAdapter{

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        System.out.println("i am LoginInterceptor. can i help u?  ");
        return true;
    }
    @Override
    public void postHandle(
            HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
            throws Exception {
        System.out.println("i am LoginInterceptor. postHandle ");
    }

    /**
     * This implementation is empty.
     */
    @Override
    public void afterCompletion(
            HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {

        System.out.println("i am LoginInterceptor. afterCompletion ");
    }

    /**
     * This implementation is empty.
     */
    @Override
    public void afterConcurrentHandlingStarted(
            HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        System.out.println("i am LoginInterceptor. afterConcurrentHandlingStarted ");
    }


}
