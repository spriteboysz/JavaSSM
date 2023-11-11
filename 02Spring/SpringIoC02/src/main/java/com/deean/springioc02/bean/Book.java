package com.deean.springioc02.bean;

import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Author: Deean
 * Date: 2023-11-11 15:45
 * FileName: src/main/java/com/deean/springioc02/bean
 * Description:
 */

@Component
@Scope("singleton")
@Lazy()
@ToString
@Setter
public class Book {
    private int bookId = 1;
    private String bookName = "Java";

    public Book() {
        System.out.println("---Book实例创建---");
    }
}
