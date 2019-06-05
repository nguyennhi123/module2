import java.util.Scanner;

public class minArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]arr = new int[10];
        for (int i = 0; i< 10; i++) {
            System.out.println("enter element " + (i + 1) + ":");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i< 10; i++) {
            System.out.print(arr[i]+"\t");
        }
        int min = arr[0];
        for (int i = 0; i< 10; i++){

            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println();
        System.out.println("min is: "+ min);
    }
}
