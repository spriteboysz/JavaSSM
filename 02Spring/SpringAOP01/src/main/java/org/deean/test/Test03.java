package org.deean.test;

import org.deean.dao.BookDAOImpl;
import org.deean.dao.StudentDAOImpl;
import org.deean.proxy.CGLibDynamicProxy;

/**
 * Author: Deean
 * Date: 2023-11-11 20:02
 * FileName: src/main/java/org/deean/test
 * Description:
 */

public class Test03 {
    public static void main(String[] args) {
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
