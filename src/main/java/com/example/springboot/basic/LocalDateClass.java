package com.example.springboot.basic;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author JuJianFei
 * @date 2018/11/22 15:31
 */
public class LocalDateClass {

    public static void main(String[] args) {
        LocalDate now = getDate(System.currentTimeMillis());
        System.out.println(now);
    }

    private static LocalDate getDate(Long ts){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = dateFormat.format(ts);
        return LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
    }
}
