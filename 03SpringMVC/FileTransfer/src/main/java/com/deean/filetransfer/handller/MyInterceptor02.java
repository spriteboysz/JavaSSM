package com.deean.filetransfer.handller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * Author: Deean
 * Date: 2023-11-17 23:11
 * FileName: src/main/java/com/deean/filetransfer/handller
 * Description:
 */

public class MyInterceptor02 implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        System.out.println("---MyInterceptor02 pre handle---");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("---MyInterceptor02 post handle---");
        assert modelAndView != null;
        modelAndView.addObject("tips02", "Interceptor02 pos handle");
    }

    // output
    // ---MyInterceptor01 pre handle---
    // ---MyInterceptor02 pre handle---
    // ---book add---
    // Book(bookId=0, bookName=平凡的世界, bookAuthor=路遥, bookPrice=11.2, BookCover=img/1700235177886.jpg)
    // ---MyInterceptor02 post handle---
    // ---MyInterceptor01 post handle---
}
