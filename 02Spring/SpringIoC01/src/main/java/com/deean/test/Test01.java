package com.deean.test;

import com.deean.bean.Student;

import java.util.Date;

/**
 * Author: Deean
 * Date: 2023-11-09 23:51
 * FileName: src/main/java/com/deean/test
 * Description:
 */

public class Test01 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStuNum("10001");
        student1.setStuName("张三");
        student1.setStuGender("男");
        student1.setStuAge(21);
        student1.setStuBirthday(new Date());
        System.out.println(student1);
    }
}
