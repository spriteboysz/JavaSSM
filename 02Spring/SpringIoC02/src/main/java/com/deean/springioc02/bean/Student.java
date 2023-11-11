package com.deean.springioc02.bean;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.util.Date;

/**
 * Author: Deean
 * Date: 2023-11-11 15:15
 * FileName: src/main/java/com/deean/springioc02/bean
 * Description:
 */

@Component
@Scope("prototype") // 多例模式
@ToString
public class Student {
    private String stuNum;
    private String stuName;
    private String stuGender;
    private int stuAge;
    private Date stuBirthday;
    @Autowired(required = false)
    private Clazz clazz;
    @Resource // 自动装配 1. ByName 2.ByType
    private Book book;

    @PostConstruct
    public void init() {
        System.out.println("---student init---");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("---student destroy---");
    }

    @Autowired  // 根据名字自动装配
    public void setClazz(@Qualifier("clazz") Clazz clazz) {
        this.clazz = clazz;
    }
}
