package com.deean.ssmdemo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Author: Deean
 * Date: 2023-11-18 22:53
 * FileName: src/main/java/com/deean/ssmdemo/service
 * Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    private String stuNum;
    private String stuName;
    private String stuPassword;
    private int stuClassId;
}
