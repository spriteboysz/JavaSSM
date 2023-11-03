package org.deean.dao;

import org.apache.ibatis.session.SqlSession;
import org.deean.pojo.Student;
import org.deean.utils.MyBatisUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentDAOTest {

    @Test
    void insertStudent() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        try {
            StudentDAO studentDAO = sqlSession.getMapper(StudentDAO.class);
            Student student = new Student(0, "20240101", "冯G", "M", 20, 2, "星星");
            int result = studentDAO.insertStudent(student);
            System.out.println(student);
            System.out.println(result);
            sqlSession.commit();
        } catch (Exception e) {
            sqlSession.rollback();
        }
    }

    @Test
    void deleteStudent() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        StudentDAO studentDAO = sqlSession.getMapper(StudentDAO.class);
        int result = studentDAO.deleteStudent("20240101");
        sqlSession.commit();
        assertEquals(1, result);
    }

    @Test
    void updateStudent() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        StudentDAO studentDAO = sqlSession.getMapper(StudentDAO.class);
        Student student = new Student(0, "20240101", "冯H", "M", 18, 2, "星星");
        int result = studentDAO.updateStudent(student);
        sqlSession.commit();
        assertEquals(1, result);
    }

    @Test
    void listStudent() {
        StudentDAO studentDAO = MyBatisUtil.getMapper(StudentDAO.class);
        List<Student> students = studentDAO.listStudent();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    void queryStudent() {
        StudentDAO studentDAO = MyBatisUtil.getMapper(StudentDAO.class);
        Student student = studentDAO.queryStudent("20220101");
        System.out.println(student);
        assertNotNull(student);
    }

    @Test
    void getCount() {
        StudentDAO studentDAO = MyBatisUtil.getMapper(StudentDAO.class);
        int count = studentDAO.getCount();
        assertNotEquals(count, 0);
        System.out.println(count);
    }

    @Test
    void listStudentByPage() {
        StudentDAO studentDAO = MyBatisUtil.getMapper(StudentDAO.class);
        List<Student> students = studentDAO.listStudentByPage(1, 2);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}