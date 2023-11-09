package com.deean.test;

import com.deean.bean.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: Deean
 * Date: 2023-11-09 23:59
 * FileName: src/main/java/com/deean/test
 * Description:
 */

public class Test02 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student2 = (Student) context.getBean("student");
        System.out.println(student2);

    }
}
