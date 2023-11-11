package com.deean.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Author: Deean
 * Date: 2023-11-10 21:52
 * FileName: src/main/java/com/deean/bean
 * Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Subject {
    private int subjectId;
    private String subjectName;
}
