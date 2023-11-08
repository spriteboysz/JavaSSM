package com.deean.dao;

import com.deean.pojo.Clazz;
import com.deean.utils.MyBatisUtil;
import org.junit.jupiter.api.Test;

class ClassDAOTest {

    @Test
    void queryClass() {
        ClassDAO classDAO = MyBatisUtil.getMapper(ClassDAO.class);
        Clazz clazz = classDAO.queryClass(1);
        System.out.println(clazz);
    }

    @Test
    void queryClass11() {
        ClassDAO classDAO = MyBatisUtil.getMapper(ClassDAO.class);
        Clazz clazz = classDAO.queryClass11(1);
        System.out.println(clazz);
    }

    @Test
    void queryClass12() {
        ClassDAO classDAO = MyBatisUtil.getMapper(ClassDAO.class);
        Clazz clazz = classDAO.queryClass12(1);
        System.out.println(clazz);
    }
}