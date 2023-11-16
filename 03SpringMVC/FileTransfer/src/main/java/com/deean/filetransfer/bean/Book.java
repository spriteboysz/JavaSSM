package com.deean.filetransfer.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Author: Deean
 * Date: 2023-11-16 23:28
 * FileName: src/main/java/com/deean/filetransfer/bean
 * Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
    private int bookId;
    private String bookName;
    private String bookAuthor;
    private double bookPrice;
    private String BookCover;
}
