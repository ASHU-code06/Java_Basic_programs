import java.util.Scanner;

public class FrequencyOfEachElement {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n =obj.nextInt();
        int array[] = new int[n];

        int visitedarr[] = new int[array.length];
        int visited = -1;
        System.out.println("Enter elements of an array");
        for (int k = 0; k < array.length; k++) {
            array[k] = obj.nextInt();
        }
        int count = 1;
        for (int f = 0; f < array.length; f++) {

            for (int g = f + 1; g < array.length; g++) {
                if (array[f] == array[g]) {
                    visitedarr[f] = visited;
                    count++;
                }
            }
            if (visitedarr[f] != visited) {
                visitedarr[f] = count;
            }
        }
        for (int i=0;i<visitedarr.length;i++){
            if (visitedarr[i]!=visited){
                System.out.println("Frequency of "+array[i]+" : "+visitedarr[i]);
            }
        }
    }
}
