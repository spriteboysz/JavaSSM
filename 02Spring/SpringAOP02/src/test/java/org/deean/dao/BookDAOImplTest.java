package org.deean.dao;

import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookDAOImplTest extends TestCase {

    public void testBookDAO() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDAOImpl bookDAO = (BookDAOImpl) context.getBean("bookDAOImpl");
        bookDAO.insert();
        bookDAO.delete();
    }
}