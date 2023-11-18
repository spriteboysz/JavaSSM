package com.deean.ssmdemo.dao;

import com.deean.ssmdemo.bean.Student;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@ContextConfiguration({"classpath:spring-context.xml", "classpath:spring-mvc.xml", "classpath:spring-mybatis.xml"})
class StudentDAOTest {

    @Resource
    private StudentDAO studentDAO;

    @Test
    void queryStudentByName() {
        Student student = studentDAO.queryStudentByName("张三");
        System.out.println(student);
        assertNotNull(student);
    }
}