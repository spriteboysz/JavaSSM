package com.deean.springmvcbasic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public void add(String name, String author, double price) {
        System.out.println("---book add---");
        System.out.println(name);
        System.out.println(author);
        System.out.println(price);

    }

    @RequestMapping("/list")
    public void list() {
        System.out.println("---book list---");

    }
}
