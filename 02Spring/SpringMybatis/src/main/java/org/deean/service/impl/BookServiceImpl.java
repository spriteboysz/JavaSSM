package org.deean.service.impl;

import org.deean.dao.BookDAO;
import org.deean.pojo.Book;
import org.deean.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-11-14 00:06
 * FileName: src/main/java/org/deean/service/impl
 * Description:
 */

@Service
public class BookServiceImpl implements BookService {

    @Resource
    private BookDAO bookDAO;


    @Override
    public List<Book> listBook() {
        return bookDAO.queryBook();
    }
}
