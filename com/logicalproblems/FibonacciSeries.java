package com.logicalproblems;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Fibonacci Series\na=0  b=1");
        int sum = 0, a = 0, b = 1;
        for (int i=0;i<10;i++){
            sum = a + b;
            a = b;
            b = sum ;
            System.out.print(" "+sum);
        }
    }
}