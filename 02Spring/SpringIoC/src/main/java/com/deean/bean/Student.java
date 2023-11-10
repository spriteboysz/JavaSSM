package com.deean.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2023-11-09 23:49
 * FileName: src/main/java/com/deean/bean
 * Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    private String stuNum;
    private String stuName;
    private String stuGender;
    private int stuAge;
    private Date StuBirthday;
    List<Subject> subjects;
    Set<Clazz> classes;

    public void init() {
        System.out.println("---init---");
    }

    public void destroy() {
        System.out.println("---destroy---");
    }
}
