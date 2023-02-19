package JavaConditionalProgramsDay2;
import java.util.Scanner;
class PrimeFractorization {
        public static void main(String[] args){
            System.out.println("Enter number");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            System.out.println("prime factors are ");
            int fact =1;
            for(int i = 2; i< num; i++) {
                while(num%i == 0) {
                    System.out.println(i+" ");
                    num = num/i;
                }
            }
            if(num >2) {
                System.out.println("and "+num);
            }
        }
    }

