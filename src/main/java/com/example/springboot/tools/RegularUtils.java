package com.example.springboot.tools;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author JuJianFei
 * @date 2018/11/22 14:36
 */
public class RegularUtils {

    public static void main(String[] args) {
        String email = "jujianfei@askingdata.com";
        String strEmail = email.substring(email.lastIndexOf("@") + 1);
        String regular = "(askingdata)|(priseer)";
        if(RegularUtils.matchString(strEmail,regular)){
            System.out.println("second style success.");
        }
    }

    /**
     * 判断 字符串 是否 包含规则中的字符串
     * @param input 输入字符串
     * @param regular 匹配规则
     * @return 是否成功匹配标志位
     */
    private static boolean matchString(String input, String regular){
        Pattern pattern = Pattern.compile(regular);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

}
