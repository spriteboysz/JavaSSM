package com.deean.filetransfer.controller;

import com.deean.filetransfer.bean.Book;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-11-16 23:29
 * FileName: src/main/java/com/deean/filetransfer/controller
 * Description:
 */

@Controller
@RequestMapping("/book")
public class BookController {

    @RequestMapping("/add")
    public String addBook(Book book, @RequestParam("bookImage") MultipartFile bookImage, HttpServletRequest request) {
        System.out.println("---book add---");
        String originalFilename = bookImage.getOriginalFilename();
        assert originalFilename != null;
        String ext = originalFilename.substring(originalFilename.lastIndexOf("."));
        String fileName = System.currentTimeMillis() + ext;

        String path = request.getServletContext().getRealPath("img");
        String savePath = path + "/" + fileName;
        try {
            bookImage.transferTo(new File(savePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        book.setBookCover("img/" + fileName);
        System.out.println(book);
        return "/tips.jsp";
    }

    @RequestMapping("/list")
    @ResponseBody
    public String[] listBook(HttpServletRequest request) {
        String path = request.getServletContext().getRealPath("img");
        File imgDir = new File(path);
        System.out.println(Arrays.toString(imgDir.list()));
        return imgDir.list();
    }

    @RequestMapping("/download")
    public void downloadImg(String fileName, HttpServletRequest request, HttpServletResponse response) throws IOException {
        String path = request.getServletContext().getRealPath("img");
        String filePath = path + "/" + fileName;
        FileInputStream fileInputStream = new FileInputStream(filePath);
        response.setContentType("application/exe");
        response.addHeader("content-disposition", "attachment;filename=" + fileName);
        IOUtils.copy(fileInputStream, response.getOutputStream());
    }
}
