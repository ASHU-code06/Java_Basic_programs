package com.bridgelabz;

import java.util.Scanner;

public class Swapping {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first number i.e. value of x");
        int x = obj.nextInt();
        System.out.println("Enter second number i.e. value of y");
        int y = obj.nextInt();
        System.out.println("Before swapping x = "+x+" and y = "+y);
        int swap;
        swap=x;
        x=y;
        y=swap;
        System.out.println("Before swapping x = "+x+" and y = "+y);

    }
}
