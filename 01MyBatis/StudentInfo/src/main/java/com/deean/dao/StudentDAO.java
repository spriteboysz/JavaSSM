package com.deean.dao;

import com.deean.pojo.Student;

/**
 * Author: Deean
 * Date: 2023-11-06 22:54
 * FileName: src/main/java/com/deean/dao
 * Description:
 */

public interface StudentDAO {
    int insertStudent(Student student);

    Student queryStudent01(String stuNum);

    Student queryStudent02(String stuName);
}
