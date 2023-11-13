package org.deean.service.impl;

import org.deean.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

class StudentServiceImplTest {

    @Test
    void listStudent() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentServiceImpl studentService = (StudentServiceImpl) context.getBean("studentServiceImpl");
        List<Student> students = studentService.listStudent();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}