package com.deean.ssmdemo.dao;

import com.deean.ssmdemo.bean.Student;

public interface StudentDAO {
    Student queryStudentByName(String name);
}
