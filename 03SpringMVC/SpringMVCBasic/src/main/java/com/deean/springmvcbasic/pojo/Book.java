package com.deean.springmvcbasic.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Author: Deean
 * Date: 2023-11-15 00:07
 * FileName: src/main/java/com/deean/springmvcbasic/pojo
 * Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
    private String name;
    private String author;
    private double price;
}
