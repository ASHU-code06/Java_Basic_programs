package com.bridgelabz;

import java.util.Scanner;

public class ComputationOfQuotientAndRemainder {
    public static void main(String args[]) {
        System.out.println("Java program to Compute Quotient and Remainder.");
        System.out.println("Enter value of N(Dividend) and it must not be equal to 0");
        Scanner input = new Scanner(System.in);
        float N = input.nextInt();
        System.out.println("Enter value of M(Divisor) and it must not be equal to 0");
        float M = input.nextInt();
        float Quotient = N / M;
        float Remainder = N % M;
        System.out.println("Quotient is " + Quotient);
        System.out.println("Remainder is " + Remainder);
    }
}
