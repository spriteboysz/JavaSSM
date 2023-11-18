package com.deean.ssmdemo.service;

import com.deean.ssmdemo.bean.Student;

public interface StudentService {
    Student checkLogin(String stuName, String stuPassword);
}
