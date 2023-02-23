package com.logicalproblems;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        System.out.println("prime factors are ");
        for(int i = 2; i< num; i++) {
            while(num%i == 0) {
                System.out.println(i+" ");
                num = num/i;
            }
        }
        if(num >2) {
            System.out.println(num);
        }


    }
}
