package com.company;
/*
对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”
 */

//简单方法：使用JAVA内置函数
public class LeftRotateStringTest {
    public String LeftRotateString(String str,int n) {
        if(str==""||n>str.length()) return "";
        String end = str.substring(0,n-1);
        String head = str.substring(n,str.length()-1);
        return head + end;
    }
}

