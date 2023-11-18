package com.deean.ssmdemo.controller;

import com.deean.ssmdemo.bean.Student;
import com.deean.ssmdemo.service.StudentService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Author: Deean
 * Date: 2023-11-18 23:25
 * FileName: src/main/java/com/deean/ssmdemo/controller
 * Description:
 */

@Controller
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;
    @RequestMapping("/login")
    public String login(String stuName, String stuPassword, HttpServletRequest request){
        Student student = studentService.checkLogin(stuName, stuPassword);
        if (student == null) {
            request.setAttribute("tips", "用户名或密码错误");
            return "/login.jsp";
        }
        request.getSession().setAttribute("student", student);
        return "redirect:/index.jsp";
    }
}
