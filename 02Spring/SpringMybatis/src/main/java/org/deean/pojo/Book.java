package org.deean.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Author: Deean
 * Date: 2023-11-14 00:03
 * FileName: src/main/java/org/deean/pojo
 * Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
    private int bId;
    private String bookNum;
    private String bookName;
    private String bookAuthor;
    private double bookPrice;
    private String bookDesc;
    private int bookStock;
}
