package com.example.springboot.basic;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author JuJianFei
 * @date 2018/12/17 15:55
 */
public class DateClass {

    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.of(1970,1,1,0,0,0);
        Timestamp timestamp = Timestamp.valueOf(date);

        System.out.println(convert(timestamp));
    }

    public static Timestamp convert(Timestamp timestamp){
        if(timestamp != null){
            LocalDateTime date = LocalDateTime.of(1970,1,1,0,0,0);
            if(timestamp.after(Timestamp.valueOf(date))){
                return timestamp;
            }else {
                return Timestamp.valueOf(date.plusHours(8).plusSeconds(1));
            }
        }else {
            return timestamp;
        }
    }
}
