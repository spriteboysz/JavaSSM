package com.deean.springmvcbasic.controllers;

import com.deean.springmvcbasic.pojo.Book;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-11-15 00:02
 * FileName: src/main/java/com/deean/springmvcbasic/controllers
 * Description:
 */

@Controller
@RequestMapping("/book")
public class BookController {
    @RequestMapping("/add")
    public ModelAndView add(String name, String author, double price) {
        System.out.println("---book add---");
        System.out.println(name);
        System.out.println(author);
        System.out.println(price);
        return new ModelAndView("redirect:/tips.jsp");   //重定向
        // return new ModelAndView("/tips.jsp");    //转发
    }

    @RequestMapping("/add2")
    public String add2(String name, String author, double price, Model model) {
        System.out.println("---book add2---");
        model.addAttribute("key1", "value1");
        return "/tips.jsp";
    }

    @RequestMapping("/add3")
    public ModelAndView add3(String name, String author, double price) {
        System.out.println("---book add3---");
        ModelAndView modelAndView = new ModelAndView("/tips.jsp");
        modelAndView.addObject("key1", new Book());
        return modelAndView;
    }

    @RequestMapping("/list")
    public void list(@RequestBody Book book, HttpServletResponse response) {
        System.out.println("---book list---");

        String s;
        try {
            s = new ObjectMapper().writeValueAsString(book);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");
        PrintWriter out;
        try {
            out = response.getWriter();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        out.println(s);
        out.flush();
        out.close();
    }

    @RequestMapping("/list2")
    @ResponseBody
    public List<Book> list2(@RequestBody Book book, HttpServletResponse response) {
        System.out.println("---book list---");
        return new ArrayList<>();
    }
}
