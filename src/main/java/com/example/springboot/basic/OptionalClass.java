package com.example.springboot.basic;

import java.util.Optional;

/**
 * @author JuJianFei
 * @date 2018/11/29 10:41
 */
public class OptionalClass {

    public static void main(String[] args) {
        Optional<String> found = Optional.ofNullable(find());
        System.out.println(found.orElse(""));
    }

    public static String find(){
        return null;
    }
}
