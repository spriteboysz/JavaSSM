package com.deean.filetransfer.handller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.Enumeration;

/**
 * Author: Deean
 * Date: 2023-11-17 23:11
 * FileName: src/main/java/com/deean/filetransfer/handller
 * Description:
 */

public class MyInterceptor01 implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        System.out.println("---MyInterceptor01 pre handle---");
        Enumeration<String> keys = request.getParameterNames();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            if ("bookName".equals(key)) {
                return true;
            }
        }
        response.setStatus(400);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("---MyInterceptor01 post handle---");
        assert modelAndView != null;
        modelAndView.addObject("tips01", "pos handle");
    }
}
