package com.example.springboot.basic;

/**
 * @author JuJianFei
 * @date 2018/11/22 15:21
 */
public class IntegerClass {

    public static void main(String[] args) {
        int needRevertNum = 15;
        int result = threeExpression(needRevertNum);
        System.out.println(result);
    }

    private static int threeExpression(int param){
        int temp = param % 7;
        return (temp == 0) ? 7 : temp;
    }
}
