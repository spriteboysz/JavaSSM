package org.deean.utils;

import org.deean.dao.StudentDAO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class MyBatisUtilTest {

    @Test
    void getSqlSession() {
        assertNotNull(MyBatisUtil.getSqlSession());
    }

    @Test
    void getMapper() {
        StudentDAO studentDAO = MyBatisUtil.getMapper(StudentDAO.class);
        System.out.println(studentDAO);
        assertNotNull(studentDAO);
    }
}