package org.deean.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.deean.pojo.Student;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

class StudentDAOTest {

    @Test
    void insertStudent() {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(resourceAsStream);
            SqlSession sqlSession = factory.openSession();
            StudentDAO studentDAO = sqlSession.getMapper(StudentDAO.class);
            Student student = new Student(15, "20240101", "冯G", "M", 18, 2, "星星");
            assert (studentDAO.insertStudent(student) == 1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void deleteStudent() {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(resourceAsStream);
            SqlSession sqlSession = factory.openSession();
            StudentDAO studentDAO = sqlSession.getMapper(StudentDAO.class);
            assert (studentDAO.deleteStudent("20240101") == 1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}