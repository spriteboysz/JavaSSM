package com.deean.test;

import com.deean.bean.Book;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: Deean
 * Date: 2023-11-10 22:16
 * FileName: src/main/java/com/deean/test
 * Description:
 */

public class Test03 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Book book1 = (Book) context.getBean("book");
        System.out.println(book1);

        Book book2 = (Book) context.getBean("book");
        System.out.println(book2);
    }
}
