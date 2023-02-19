package JavaConditionalProgramsDay2;

import java.util.Scanner;

public class PrintMonth {
    public static void main(String args[]){
        System.out.println("Enter a number and i will tell you the respective month");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        numberToMonth(num);

    }
    public static void numberToMonth(int number){
        switch (number){
            case 1:
                System.out.println("JANUARY");
                break;
            case 2:
                System.out.println("FEBRUARY");
                break;
            case 3:
                System.out.println("MARCH");
                break;
            case 4:
                System.out.println("APRIL");
                break;
            case 5:
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("JUNE");
                break;
            case 7:
                System.out.println("JULY");
                break;
            case 8:
                System.out.println("AUGUST");
                break;
            case 9:
                System.out.println("SEPTEMBER");
                break;
            case 10:
                System.out.println("OCTOBER");
                break;
            case 11:
                System.out.println("NOVEMBER");
                break;
            case 12:
                System.out.println("DECEMEBR");
                break;
            default:
                System.out.println("Invalid input");

        }
    }
}
