package com.company;
//给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
public class PowerTest {
    public static double Power(double thebase, int exponent)
    {
        //return Power_Solution1(thebase, exponent);
        return Power_Solution2(thebase, exponent);
    }
    //解法1：简单循环
    public static double Power_Solution1(double thebase, int exponent){
        double result = 1.0;
        if(exponent == 0) return 1.0;
        for(int i = 1 ; i <= Math.abs(exponent); i++){
            result *= thebase;
        }
        //负指数幂
        if(exponent < 0) result = 1 / result;
        return result;
    }

    //解法2：递归方法
    public static double Power_Solution2(double thebase, int exponent){
        if(exponent == 0) return 1;
        int temp = Math.abs(exponent);
        double result = 1.0;
        if(temp == 1) return thebase;

        if(temp > 1) result = Power_Solution2(thebase, temp - 1);
        result = thebase * result;
        if(exponent<0) result = 1/result;
        return result;
    }
}
