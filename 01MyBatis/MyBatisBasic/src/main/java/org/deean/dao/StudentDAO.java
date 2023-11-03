package org.deean.dao;

import org.apache.ibatis.annotations.Param;
import org.deean.pojo.Student;

import java.util.List;

public interface StudentDAO {
    int insertStudent(Student student);

    int deleteStudent(String stuNum);

    int updateStudent(Student student);

    List<Student> listStudent();

    Student queryStudent(String stuNum);

    int getCount();

    List<Student> listStudentByPage(@Param("start") int start, @Param("limit") int limit);
}
