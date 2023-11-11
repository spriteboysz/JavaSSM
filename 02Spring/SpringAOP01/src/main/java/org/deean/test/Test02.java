package org.deean.test;

import org.deean.dao.BookDAOImpl;
import org.deean.dao.GeneralDAO;
import org.deean.dao.StudentDAOImpl;
import org.deean.proxy.JDKDynamicProxy;

/**
 * Author: Deean
 * Date: 2023-11-11 19:49
 * FileName: src/main/java/org/deean/test
 * Description:
 */

public class Test02 {
    public static void main(String[] args) {
        BookDAOImpl bookDAO = new BookDAOImpl();
        GeneralDAO proxy = (GeneralDAO) new JDKDynamicProxy(bookDAO).getProxy();
        proxy.delete();

        StudentDAOImpl studentDAO = new StudentDAOImpl();
        proxy = (GeneralDAO) new JDKDynamicProxy(studentDAO).getProxy();
        proxy.update();
    }
}
