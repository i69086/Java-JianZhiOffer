package com.company;

import java.util.ArrayList;
//输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
public class GetLeastNumbers_Test {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k){
        ArrayList<Integer> result = new ArrayList<>();
        if(k>input.length) return result;
        for (int i = 0;i <= k;i++){
            for (int j = 0; j < input.length-1 ; j++){
                if (input[j] > input[j+1]){
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }
        for(int l = 0;l < k;l++){
            result.add(input[l]);
        }
        return result;
    }
}
