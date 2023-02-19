import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]){
        System.out.println("Enter a year");
        Scanner input=new Scanner(System.in);
        int year=0;
        year= input.nextInt();
        if (year%4==0||year%400==0){
            System.out.println("Yes it is a leap year");
        }else {
            System.out.println("No it is not a leap year ");
        }
    }
}
