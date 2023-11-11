package org.deean.proxy;

import junit.framework.TestCase;
import org.deean.dao.BookDAOImpl;
import org.deean.dao.GeneralDAO;
import org.deean.dao.StudentDAOImpl;

public class JDKDynamicProxyTest extends TestCase {

    public void testGetProxy() {
        BookDAOImpl bookDAO = new BookDAOImpl();
        GeneralDAO proxy = (GeneralDAO) new JDKDynamicProxy(bookDAO).getProxy();
        proxy.delete();

        StudentDAOImpl studentDAO = new StudentDAOImpl();
        proxy = (GeneralDAO) new JDKDynamicProxy(studentDAO).getProxy();
        proxy.update();
    }
}