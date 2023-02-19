import java.util.Scanner;

public class StringEquality {
    public static void main(String args[]){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter first String ");
        String string1= input.nextLine();
        System.out.println("Enter second string ");
        String string2= input.nextLine();
        if (string1.equals(string2)){
            System.out.println("yes strings are equal");
        }else {
            System.out.println("No Strings are not equal");
        }
    }
}
