package com.deean.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Author: Deean
 * Date: 2023-11-06 22:49
 * FileName: src/main/java/com/deean/pojo
 * Description:
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    private String stuNum;
    private String stuName;
    private String stuPassword;
    private int classId;
    private Detail detail;
}
