package com.example.springboot.basic;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * @author JuJianFei
 * @date 2018/11/22 15:30
 */
public class LocalDateTimeClass {

    public static void main(String[] args) {
        System.out.println(getDate(System.currentTimeMillis()));
    }

    private static LocalDateTime getDate(Long ts){
        return LocalDateTime.ofEpochSecond(ts/1000,0, ZoneOffset.ofHours(8));
    }

}
