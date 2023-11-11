package com.deean.springioc02.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Author: Deean
 * Date: 2023-11-11 15:55
 * FileName: src/main/java/com/deean/springioc02/bean
 * Description:
 */

@Component
@Scope("singleton")
@Lazy(false)
@ToString
@Data
public class Clazz {
    private int classId = 1;
    private String className = "Java";
    public Clazz(){
        System.out.println("---Class实例创建---");
    }
}
