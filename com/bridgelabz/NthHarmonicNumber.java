package com.bridgelabz;

import java.util.Scanner;

public class NthHarmonicNumber {
    public static void main(String args[]) {
        System.out.println("Java program to Print the Nth harmonic number: 1/1 + 1/2 + ... + 1/N");
        System.out.println("Enter value of N and it must no be equal to 0");
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        float harmonicSeries = 1;
        System.out.print("1.0");
        for (float i = 2; i <= N; i++) {
            harmonicSeries = 1 / i;
            System.out.print(" + "+harmonicSeries);
        }
        System.out.println("\nNth Harmonic number is "+harmonicSeries);
    }
}
