package com.company;

public class ReverseSentenceTest {
    public static String ReverseSentence(String str) {
        if(str=="") return "";
        String result = "";
        String temp ="";
        for(int i = str.length() - 1;i>=0;i--){
            if(str.charAt(i)!=' '){
                temp = str.charAt(i) + temp;
            }else{
                result += temp + " ";
                temp = "";
            }
        }
        result += temp;
        return result;
    }
}
