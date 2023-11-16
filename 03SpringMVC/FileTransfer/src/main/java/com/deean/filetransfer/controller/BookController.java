package com.deean.filetransfer.controller;

import com.deean.filetransfer.bean.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * Author: Deean
 * Date: 2023-11-16 23:29
 * FileName: src/main/java/com/deean/filetransfer/controller
 * Description:
 */

@Controller
@RequestMapping("/book")
public class BookController {

    @RequestMapping("/add")
    public void addBook(Book book, @RequestParam("bookImage") MultipartFile bookImage) {
        System.out.println("---book add---");
        System.out.println(book);
        System.out.println(bookImage);

    }
}
