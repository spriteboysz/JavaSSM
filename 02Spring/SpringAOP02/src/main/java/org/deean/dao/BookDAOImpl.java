package org.deean.dao;

import org.springframework.stereotype.Component;

/**
 * Author: Deean
 * Date: 2023-11-12 23:03
 * FileName: src/main/java/org/deean/dao
 * Description:
 */

@Component
public class BookDAOImpl {
    public void insert() {
        System.out.println("---book insert---");
    }

    public void delete() {
        System.out.println("---book delete---");
    }
}
