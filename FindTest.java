package com.company;
//算法待优化：初期未考虑有序数组情况
public class FindTest {
    public static boolean Find (int target, int[][] array) {
        for (int i = 0; i <= array[0].length - 1; i++) {
            for (int j = 0; j <= array.length - 1; j++) {
                if (array[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
