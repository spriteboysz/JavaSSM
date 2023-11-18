package com.deean.ssmdemo.service.impl;

import com.deean.ssmdemo.bean.Student;
import com.deean.ssmdemo.dao.StudentDAO;
import com.deean.ssmdemo.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Author: Deean
 * Date: 2023-11-18 23:17
 * FileName: src/main/java/com/deean/ssmdemo/service/impl
 * Description:
 */

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDAO studentDAO;

    @Override
    @Transactional
    public Student checkLogin(String stuName, String stuPassword) {
        Student student = studentDAO.queryStudentByName(stuName);
        if (student.getStuPassword().equals(stuPassword)) {
            return student;
        }
        return null;
    }
}
