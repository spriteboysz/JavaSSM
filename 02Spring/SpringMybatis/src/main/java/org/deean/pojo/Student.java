package org.deean.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Author: Deean
 * Date: 2023-11-13 23:03
 * FileName: src/main/java/org/deean/pojo
 * Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    private int sId;
    private String stuNum;
    private String stuName;
    private String stuGender;
    private int stuAge;
    private int stuClass;
    private String stuDesc;
}
