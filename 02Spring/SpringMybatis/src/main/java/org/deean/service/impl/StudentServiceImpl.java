package org.deean.service.impl;

import org.deean.dao.StudentDAO;
import org.deean.pojo.Student;
import org.deean.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-11-13 23:55
 * FileName: src/main/java/org/deean/service/impl
 * Description:
 */

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDAO studentDAO;

    @Override
    public List<Student> listStudent() {
        return studentDAO.queryStudent();
    }
}
