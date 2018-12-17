package com.example.springboot.basic;

/**
 * @author JuJianFei
 * @date 2018/12/14 18:05
 */
public class StringClass {

    public static void main(String[] args) {

        // 英文半角逗号
        String yb = ",";
        // 英文全角逗号
        String yq = "，";

        String s = "a，b，c，d";
        String[] ss = s.split(",|，");
        for (String a:ss){
            System.out.println(a);
        }
    }
}
