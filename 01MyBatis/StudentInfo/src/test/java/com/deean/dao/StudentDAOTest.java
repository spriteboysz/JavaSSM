package com.deean.dao;

import com.deean.pojo.Detail;
import com.deean.pojo.Student;
import com.deean.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentDAOTest {

    @Test
    void insertStudent() {
        Student student = new Student("20231003", "李F", "123456", 1, null, null, null);
        Detail detail = new Detail(0, "AAA", "13830303030", "AAA", student.getStuNum());
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        try {
            StudentDAO studentDAO = sqlSession.getMapper(StudentDAO.class);
            int i = studentDAO.insertStudent(student);
            DetailDAO detailDAO = sqlSession.getMapper(DetailDAO.class);
            int j = detailDAO.insertDetail(detail);
            assertEquals(1, i * j);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        }
    }

    @Test
    void queryStudent01() {
        // 关联查询
        StudentDAO studentDAO = MyBatisUtil.getMapper(StudentDAO.class);
        Student student = studentDAO.queryStudent01("20231002");
        System.out.println(student);
    }

    @Test
    void queryStudent02() {
        // 子查询
        StudentDAO studentDAO = MyBatisUtil.getMapper(StudentDAO.class);
        Student student = studentDAO.queryStudent02("张三");
        System.out.println(student);
    }

    @Test
    void queryStudent11() {
        // 关联查询
        StudentDAO studentDAO = MyBatisUtil.getMapper(StudentDAO.class);
        Student student = studentDAO.queryStudent11("20231002");
        System.out.println(student);
    }

    @Test
    void queryStudent12() {
        // 子查询
        StudentDAO studentDAO = MyBatisUtil.getMapper(StudentDAO.class);
        Student student = studentDAO.queryStudent12("张三");
        System.out.println(student);
    }

    @Test
    void listStudentByClassId() {
        StudentDAO studentDAO = MyBatisUtil.getMapper(StudentDAO.class);
        List<Student> students = studentDAO.listStudentByClassId("1");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    void listStudentByCId() {
        StudentDAO studentDAO = MyBatisUtil.getMapper(StudentDAO.class);
        List<Student> students = studentDAO.listStudentByCId("20231002");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}