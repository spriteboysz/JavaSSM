package com.deean.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * Author: Deean
 * Date: 2023-11-08 20:54
 * FileName: src/main/java/com/deean/pojo
 * Description:
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Clazz {
    private int classId;
    private String className;
    private String classDesc;
    List<Student> students;
}
