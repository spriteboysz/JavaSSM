package org.deean.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.deean.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class StudentDAOTest {

    @Test
    void queryStudent() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) context.getBean("sqlSessionFactory");
        assertNotNull(sqlSessionFactory);
        StudentDAO studentDAO = (StudentDAO) context.getBean("studentDAO");
        List<Student> students = studentDAO.queryStudent();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}