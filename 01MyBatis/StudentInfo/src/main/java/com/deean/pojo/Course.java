package com.deean.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * Author: Deean
 * Date: 2023-11-08 21:50
 * FileName: src/main/java/com/deean/pojo
 * Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Course {
    private String cId;
    private String cName;
    private List<Student> students;
}
