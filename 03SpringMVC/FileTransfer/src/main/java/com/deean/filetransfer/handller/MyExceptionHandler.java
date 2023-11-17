package com.deean.filetransfer.handller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Author: Deean
 * Date: 2023-11-17 21:41
 * FileName: src/main/java/com/deean/filetransfer/handller
 * Description:
 */

@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(NullPointerException.class)
    public String nullHandller() {
        return "/err1.jsp";
    }

    @ExceptionHandler(NumberFormatException.class)
    public String formatHandler() {
        return "/err2.jsp";
    }
}
