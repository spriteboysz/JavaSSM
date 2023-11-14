package org.deean.service.impl;

import org.deean.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

class BookServiceImplTest {

    @Test
    void listBook() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bookService = (BookServiceImpl) context.getBean("bookServiceImpl");
        List<Book> books = bookService.listBook();
        for (Book book : books) {
            System.out.println(book);
        }
    }
}