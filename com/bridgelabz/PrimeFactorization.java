package com.bridgelabz;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String args[]) {
        System.out.println("Enter number ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("prime factors are ");
        for(int i = 2; i< num; i++) {
            while(num%i == 0) {
                System.out.println(i+" ");
                num = num/i;
            }
        }
        if(num >2) {
            System.out.println("1\n"+num);
        }
    }
 }

