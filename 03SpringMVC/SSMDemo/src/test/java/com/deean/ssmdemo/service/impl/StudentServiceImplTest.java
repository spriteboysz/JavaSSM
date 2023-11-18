package com.deean.ssmdemo.service.impl;

import com.deean.ssmdemo.bean.Student;
import com.deean.ssmdemo.service.StudentService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@ExtendWith(SpringExtension.class)
@ContextConfiguration({"classpath:spring-context.xml", "classpath:spring-mvc.xml", "classpath:spring-mybatis.xml"})
class StudentServiceImplTest {

    @Resource
    private StudentService studentService;

    @Test
    void checkLogin() {
        Student student1 = studentService.checkLogin("张三", "123456");
        assertNotNull(student1);
        Student student2 = studentService.checkLogin("张三", "111111");
        assertNull(student2);
    }
}