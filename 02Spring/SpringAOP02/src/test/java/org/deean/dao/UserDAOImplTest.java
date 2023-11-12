package org.deean.dao;

import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDAOImplTest extends TestCase {

    public void testUserDAO() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDAOImpl userDAO = (UserDAOImpl) context.getBean("userDAOImpl");
        userDAO.insert();
        userDAO.delete();
    }
}