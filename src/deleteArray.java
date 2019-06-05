import java.util.Scanner;

public class deleteArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]arr = {2,4,5,6,7,8,9};
        System.out.println("enter number:");
        int number = scanner.nextInt();
        int index = 0;
        for (int i = 0;i <arr.length; i++){
            if (number== arr[i]){
                index = i;
                System.out.println("number in element "+(index+1));
                arr[i] = number;
            }
        }
        for (int i = index;i <arr.length-1; i++){
            arr[i] = arr[(i+1)];
        }
        for (int i = 0;i <arr.length-1; i++){
            System.out.print(arr[i]+" \t");
        }
    }
}
