package com.company;
//求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
public class Sum_SolutionTest {
    public static int Sum_Solution(int n){
        return sum(n);
    }
    public static int sum(int n){
        try{
            int i = 1%n;
            return n + sum(n-1);
        }catch(Exception ex){
            return 0;
        }
    }
}
