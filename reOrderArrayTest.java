package com.company;
/*
输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class reOrderArrayTest {
    public static void reOrderArray(int [] array) {
        for(int j = 0; j < array.length; j++){
            for(int i = 0; i < array.length-1; i++){
                if(array[i]%2==0&&array[i+1]%2!=0){
                    int temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}
