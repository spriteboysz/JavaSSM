package org.deean.test;

import org.deean.dao.BookDAOImpl;
import org.deean.dao.StudentDAOImpl;
import org.deean.proxy.StaticProxy;

/**
 * Author: Deean
 * Date: 2023-11-11 19:34
 * FileName: src/main/java/org/deean/test
 * Description:
 */

public class Test01 {
    public static void main(String[] args) {
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
