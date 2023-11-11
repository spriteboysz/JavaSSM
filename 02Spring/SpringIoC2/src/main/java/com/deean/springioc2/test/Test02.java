package com.deean.springioc2.test;

import com.deean.springioc2.bean.Book;
import com.deean.springioc2.bean.Clazz;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: Deean
 * Date: 2023-11-11 15:48
 * FileName: src/main/java/com/deean/springioc2/test
 * Description:
 */

public class Test02 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("---工厂初始化---");
        Book book = (Book) context.getBean("book");
        System.out.println(book);

        Clazz clazz = (Clazz) context.getBean("clazz");
        System.out.println(clazz);
        //测试结果：clazz单例-饿汉（默认），book单例-懒汉
        //---Class实例创建---
        //---工厂初始化---
        //---Book实例创建---
        //com.deean.springioc2.bean.Book@5dda768f
        //com.deean.springioc2.bean.Clazz@7a8c8dcf
    }
}
