package JavaConditionalProgramsDay2;
import java.util.Scanner;
public class PowerOf2 {
        public static void main(String[] args){

            System.out.println("This program is for printing power of 2");
            Scanner myinput = new Scanner(System.in);
            System.out.println("Enter the value of n ");
            int n = myinput.nextInt();
            int power=1;
            for( int i=1;i<31&&i<=n;i++){
                power=power*2;

            }
            System.out.println(" ");
            System.out.println(""+power);
        }
    }

