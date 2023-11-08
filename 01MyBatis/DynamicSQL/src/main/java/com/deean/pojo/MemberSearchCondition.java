package com.deean.pojo;

import lombok.Data;

/**
 * Author: Deean
 * Date: 2023-11-08 23:05
 * FileName: src/main/java/com/deean/pojo
 * Description:
 */

@Data
public class MemberSearchCondition {
    private String gender;
    private Integer minAge;
    private Integer maxAge;
    private String city;
}
