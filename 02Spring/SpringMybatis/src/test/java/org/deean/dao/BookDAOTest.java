package org.deean.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.deean.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class BookDAOTest {

    @Test
    void queryBook() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) context.getBean("sqlSessionFactory");
        assertNotNull(sqlSessionFactory);
        BookDAO bookDAO = (BookDAO) context.getBean("bookDAO");
        List<Book> books = bookDAO.queryBook();
        for (Book book : books) {
            System.out.println(book);
        }
    }
}