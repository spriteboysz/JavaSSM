package org.deean.dao;

import org.deean.pojo.Student;

public interface StudentDAO {
    public int insertStudent(Student student);

    public int deleteStudent(String stuNum);
}
