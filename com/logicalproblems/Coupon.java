package com.logicalproblems;

import java.util.Random;
import java.util.Scanner;

public class Coupon {
    public static void main(String[] args) {
        System.out.println("Enter numbers of coupon");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int couponGenerator;
        Random obj = new Random();
        int array[] = new int[num];
        for (int i=0;i<= array.length-1;i++) {
           couponGenerator = obj.nextInt(80000)+10000;
            array[i]=couponGenerator;
        }
        //removing duplicate Coupon
        for (int i=0;i<array.length-1;i++){
            for (int j=i+1;j<array.length-1;j++){
                if (array[i]==array[j]&&i!=j){
                    array[j]=array[j+1];
                }
            }
        }
        System.out.println("Coupon numbers are ");
        for (int c : array){
            System.out.println(c);
        }
    }
}
