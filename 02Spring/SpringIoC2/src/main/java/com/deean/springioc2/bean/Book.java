package com.deean.springioc2.bean;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Author: Deean
 * Date: 2023-11-11 15:45
 * FileName: src/main/java/com/deean/springioc2/bean
 * Description:
 */

@Component
@Scope("singleton")
@Lazy()
public class Book {
    private int bookId;
    private String bookName;

    public Book() {
        System.out.println("---Book实例创建---");
    }
}
