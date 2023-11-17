package com.deean.filetransfer.handller;


import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author: Deean
 * Date: 2023-11-17 23:46
 * FileName: src/main/java/com/deean/filetransfer/handller
 * Description:
 */

public class MyDateConvert01 implements Converter<String, Date> {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    @Override
    public Date convert(String s) {
        Date date;
        try {
            date = sdf.parse(s);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return date;
    }
}
