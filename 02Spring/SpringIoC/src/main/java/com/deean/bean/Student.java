package com.deean.bean;

import java.util.Date;

/**
 * Author: Deean
 * Date: 2023-11-09 23:49
 * FileName: src/main/java/com/deean/bean
 * Description:
 */

public class Student {
    private String stuNum;
    private String stuName;
    private String stuGender;
    private int stuAge;

    @Override
    public String toString() {
        return "Student{" +
                "stuNum='" + stuNum + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuGender='" + stuGender + '\'' +
                ", stuAge=" + stuAge +
                ", StuBirthday=" + StuBirthday +
                '}';
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public Date getStuBirthday() {
        return StuBirthday;
    }

    public void setStuBirthday(Date stuBirthday) {
        StuBirthday = stuBirthday;
    }

    private Date StuBirthday;
}
