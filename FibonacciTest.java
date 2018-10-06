package com.company;

public class FibonacciTest {
    public static int Fibonacci(int n) {
        int result = 0;
        int first = 0;
        int next = 1;
        if (n==1) return 1;
        for (int i = 0;i <= n-2;i++){
            result = first + next;
            first = next;
            next = result;
        }
        return result;
    }
}
