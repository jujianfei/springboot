package com.example.springboot.basic;

/**
 * @author JuJianFei
 * @date 2018/12/13 16:05
 */
public class DoubleClass {

    public static void main(String[] args) {
        System.out.println(doubleToFraction("12.626"));

    }

    public static String doubleToFraction(String num){
        if(num.contains(".")){
            return getDecimal(num);
        }else {
            return num;
        }
    }

    private static String getDecimal(String num){
        String[] nums = num.split("\\.");
        Integer numOne = Integer.parseInt(nums[0]);
        Double numTwo = Double.parseDouble("0." + nums[1]);

        if(numTwo >= 0.0 && numTwo <= 0.124){
            return String.valueOf(numOne);
        }else if(numTwo >= 0.125 && numTwo <= 0.374){
            return numOne+"¼";
        }else if(numTwo >= 0.375 && numTwo <= 0.624){
            return numOne+"½";
        }else if(numTwo >= 0.625 && numTwo <= 0.874){
            return numOne+"¾";
        }else{
            return String.valueOf(numOne+1);
        }
    }

}
