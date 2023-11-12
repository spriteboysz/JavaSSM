package org.deean.proxy;

import junit.framework.TestCase;
import org.deean.dao.BookDAOImpl;
import org.deean.dao.StudentDAOImpl;

public class StaticProxyTest extends TestCase {

    public void testInsert() {
        BookDAOImpl bookDAO = new BookDAOImpl();
        StaticProxy proxy = new StaticProxy(bookDAO);
        proxy.insert();
        proxy.delete();
        proxy.update();
        StudentDAOImpl studentDAO = new StudentDAOImpl();
        proxy = new StaticProxy(studentDAO);
        proxy.insert();
        proxy.delete();
        proxy.update();
    }
}