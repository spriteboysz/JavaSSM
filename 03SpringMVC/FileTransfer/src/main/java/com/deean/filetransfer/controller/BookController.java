package com.deean.filetransfer.controller;

import com.deean.filetransfer.bean.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
    private void addBook(Book book){

    }
}
