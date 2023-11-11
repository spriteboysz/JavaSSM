package com.deean.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2023-11-10 21:54
 * FileName: src/main/java/com/deean/bean
 * Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
    private int bookId;
    private String bookName;
    List<Subject> subjects;
    Map<String, Object> maps;

    public void init(){
        System.out.println("---book init---");
    }
}
