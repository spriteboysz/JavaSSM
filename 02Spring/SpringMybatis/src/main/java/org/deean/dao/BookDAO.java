package org.deean.dao;

import org.deean.pojo.Book;

import java.util.List;

public interface BookDAO {
    List<Book> queryBook();
}
