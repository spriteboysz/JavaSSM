package org.deean.proxy;

import junit.framework.TestCase;
import org.deean.dao.BookDAOImpl;
import org.deean.dao.StudentDAOImpl;

public class CGLibDynamicProxyTest extends TestCase {

    public void testBegin() {
        BookDAOImpl bookDAO = new BookDAOImpl();
        StudentDAOImpl studentDAO = new StudentDAOImpl();

        CGLibDynamicProxy cgLibDynamicProxy1 = new CGLibDynamicProxy(bookDAO);
        BookDAOImpl proxy1 = (BookDAOImpl) cgLibDynamicProxy1.getProxy();
        proxy1.update();

        CGLibDynamicProxy cgLibDynamicProxy2 = new CGLibDynamicProxy(studentDAO);
        StudentDAOImpl proxy2 = (StudentDAOImpl) cgLibDynamicProxy2.getProxy();
        proxy2.delete();
    }
}