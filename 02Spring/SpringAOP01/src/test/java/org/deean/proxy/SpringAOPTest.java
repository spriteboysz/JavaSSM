package org.deean.proxy;

import junit.framework.TestCase;
import org.deean.dao.BookDAO;
import org.deean.dao.StudentDAO;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAOPTest extends TestCase {

    public void testBegin() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDAO bookDAO = (BookDAO) context.getBean("bookDAO");
        bookDAO.update();
        bookDAO.delete();
        bookDAO.insert();

        StudentDAO studentDAO = (StudentDAO) context.getBean("studentDAO");
        studentDAO.delete();
        studentDAO.update();
        studentDAO.insert();
    }
}