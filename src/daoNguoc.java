import java.util.Scanner;

public class daoNguoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size: ");
        int size = scanner.nextInt();
        int[] arr;
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter the element " + (i + 1) + " :");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        for (int i = 0; i < arr.length / 2; i++) {
            int tem = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tem;
        }
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");


        }
    }
}
