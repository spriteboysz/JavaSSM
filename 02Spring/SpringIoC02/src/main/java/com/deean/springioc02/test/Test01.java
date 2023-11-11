package com.deean.springioc02.test;

import com.deean.springioc02.bean.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: Deean
 * Date: 2023-11-11 15:30
 * FileName: src/main/java/com/deean/springioc02/test
 * Description:
 */

public class Test01 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student1 = (Student) context.getBean("student");
        Student student2 = (Student) context.getBean("student");
        System.out.println(student1);
        System.out.println(student2);
        // 测试结果：多例结果
        //---Class实例创建---
        //com.deean.springioc02.bean.Student@5dda768f
        //com.deean.springioc02.bean.Student@7a8c8dcf
    }

}
