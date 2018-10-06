package com.company;

import java.util.ArrayList;
//输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
public class FindNumbersWithSumTest {
    public static ArrayList<Integer> FindNumbersWithSum(int[] array, int sum){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < array.length - 1; i++){
            int temp = sum - array[i];
            int low = i + 1;
            int high = array.length - 1;
            //题目中数组有序，直接使用二分查找
            while (low <= high){
                int mid = (low + high) /2;
                if (temp == array[mid]){
                    result.add(array[i]);
                    result.add(array[mid]);
                    //首先找到的，即为乘积最小
                    return result;
                }else if (temp > array[mid]){
                    low = mid + 1;
                }else if (temp < array[mid]){
                    high = mid - 1;
                }
            }
        }
        return result;
    }
}
