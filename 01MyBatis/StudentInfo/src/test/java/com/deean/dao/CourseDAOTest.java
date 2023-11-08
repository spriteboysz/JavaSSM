package com.deean.dao;

import com.deean.pojo.Course;
import com.deean.utils.MyBatisUtil;
import org.junit.jupiter.api.Test;

class CourseDAOTest {

    @Test
    void queryCourse01() {
        CourseDAO courseDAO = MyBatisUtil.getMapper(CourseDAO.class);
        Course course = courseDAO.queryCourse01("20231002");
        System.out.println(course);
    }

    @Test
    void queryCourse02() {
        CourseDAO courseDAO = MyBatisUtil.getMapper(CourseDAO.class);
        Course course = courseDAO.queryCourse02("20231002");
        System.out.println(course);
    }
}