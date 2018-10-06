package com.company;
//数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
//输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。

//使用了冒泡排序方法，时间复杂度O(n^2)，明天改进
public class MoreThanHalfNumTest {
    public static int MoreThanHalfNum_Solution(int [] array) {
        double target = array.length/2.0;
        for(int i = 0;i<array.length;i++){
            for (int j = 0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        int count = 1;
        int result = array[0];
        for(int k = 0;k<array.length-1;k++){
            if (count<target){
                if(array[k]==array[k+1]){
                    result = array[k];
                    count++;
                }else count = 1;
            }else break;
        }
        if(count>target) return result;
        else return 0;

    }
}
