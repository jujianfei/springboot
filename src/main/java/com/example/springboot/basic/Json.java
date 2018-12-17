package com.example.springboot.basic;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @author JuJianFei
 * @date 2018/12/13 14:33
 */
public class Json {

    public static void main(String[] args) {
        String[] sizeChart = new String[5];
        sizeChart[0] = "Size,Length,Bust,Waist,Shoulder";
        sizeChart[1] = "S,68.5-69,86-87,82.5-83,35-36";
        sizeChart[2] = "M,70-71,90-91,86-87,36-37";
        sizeChart[3] = "L,71,94,90,37";
        sizeChart[4] = "XL,72,98,94,38";

        String[] sizes = sizeChart[0].split(",");
        JSONObject result = new JSONObject(true);

        for(int i=1;i<sizeChart.length;i++){
            result.put("Size"+getSize(i), getChildResult(sizes,sizeChart[i].split(",")));
        }

        System.out.println(result.toJSONString());
    }

    private static String getSize(int size){
        switch (size){
            case 1:
                return "S";
            case 2:
                return "M";
            case 3:
                return "L";
            case 4:
                return "XL";
            default:
                return "XXL";
        }
    }

    private static JSONArray getChildResult(String[] sizes,String[] resultOne){

        JSONArray result = new JSONArray();

        JSONObject lineOne = new JSONObject(true);
        lineOne.put("size",resultOne[0]);
        lineOne.put("unitOne","INCH");
        lineOne.put("unitTwo","CM");
        result.add(lineOne);

        for(int i = 1;i<sizes.length;i++){
            JSONObject temp = new JSONObject(true);
            temp.put("type",sizes[i]);
            temp.put("unitOne",getInch(resultOne[i]));
            temp.put("unitTwo",resultOne[i]);
            result.add(temp);
        }

        return result;
    }

    private static String getInch(String cm){
        // cm 可能是一个范围，也可能是一个数字，首先需要区分这种情况
        if(cm.contains("-")){
            String[] nums = cm.split("-");
            Double numOne = Double.parseDouble(nums[0]);
            Double numTwo = Double.parseDouble(nums[1]);
            Double result = (numOne + numTwo) / 2;
            return DoubleClass.doubleToFraction(result.toString());
        }else {
            return cm;
        }
    }

}
