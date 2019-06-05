import java.util.Scanner;

public class poolingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]arr1;
        int[]arr2;
        System.out.println("enter size1: ");

        int size1 = scanner.nextInt();
        System.out.println("enter size2: ");
        int size2 = scanner.nextInt();
        arr1 = new int[size1];

        for(int i = 0; i<arr1.length; i++){
            System.out.println("enter element arr1 " +(i+1)+ " :");
            arr1[i] = scanner.nextInt();
        }
        arr2 = new int[size2];
        for(int i = 0; i<arr2.length; i++){
            System.out.println("enter element arr2 " +(i+1)+ " :");
            arr2[i] = scanner.nextInt();
        }
        for(int i = 0; i<arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
            System.out.println();
        for(int i = 0; i<arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }
        int size3 = arr1.length + arr1.length;
        int[] arr3 = new int[size3];
        for(int i = 0; i<arr1.length; i++){
            arr3[i] = arr1[i];
        }
        for(int i = 0;i<arr2.length; i++){
            arr3[arr1.length+i] = arr2[i];
        }
        System.out.println();
        for(int i = 0; i<arr3.length; i++){
            System.out.print(arr3[i]+ "\t");
        }









    }
}
