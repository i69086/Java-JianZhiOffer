package com.company;

public class JumpFloorTest {
    public static int JumpFloor(int target) {
        if (target <= 3) return  target;
        int a = 1; int b = 2;
        int result = 0;
        for(int i = 3; i <= target ; i++){
            result = a + b;
            a = b;
            b = result;
        }
        return  result;
    }
}
