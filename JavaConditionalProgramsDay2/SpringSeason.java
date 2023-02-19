package JavaConditionalProgramsDay2;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter month ");
        int month= obj.nextInt();
        System.out.println("Enter date");
        int date= obj.nextInt();
        if((month==3)&&(date>=20&&date<=31)) {
            System.out.println("TRUE");
        }
        else if((month==4)&&(date>=1&&date<=30)){
            System.out.println("TRUE");
        }
        else if ((month==5)&&(date>=1&&date<=31)){
            System.out.println("TRUE");
        }
        else if((month==6)&&(date>=20&&date<=31)){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }
}
