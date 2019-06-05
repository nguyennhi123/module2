import java.util.Scanner;

public class maxArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size:");
        int size = scanner.nextInt();
        int[] array;

        array = new int[size];
        for(int i = 0;i<array.length;i++){
            System.out.print("Enter element " + (i + 1) + " :");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i< array.length; i++){
            System.out.print(array[i]+"\t");
        }
        int max = array[0];
        int index = 1;
        for (int i =0; i < array.length; i++){
            if(array[i]>max){
                max = array[i];
                index = i+1;
            }
        }
        System.out.println("max is: " + max + "index is: " + index);

    }
}
