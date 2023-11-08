package com.deean.dao;

import com.deean.pojo.Student;

import java.util.List;

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

    Student queryStudent11(String stuNum);

    Student queryStudent12(String stuName);

    List<Student> listStudentByClassId(String classId);
}
