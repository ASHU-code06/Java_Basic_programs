import java.util.Scanner;

public class ElementAtEvenPosition {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n = new Scanner(System.in).nextInt();
        int array[] = new int[n];
        System.out.println("Enter elements of an array");
        for (int k = 0; k < array.length; k++) {
            array[k] = obj.nextInt();
        }
        ElementAtEvenPosition object=new ElementAtEvenPosition();
        object.PrintEvenPosElement(array);
    }
    void PrintEvenPosElement(int array[]){
        for (int i=0;i< array.length;i++){
            if(i%2==0){
                System.out.println("Element at even position is "+array[i]);
            }
        }
    }

}
