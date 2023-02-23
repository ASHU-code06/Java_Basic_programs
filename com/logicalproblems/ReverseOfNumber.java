package com.logicalproblems;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();
        int reverse = 0;
        while (number > 0) {
            int remainder = number % 10;
            number = number / 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("Reverse is "+reverse);
    }
}
