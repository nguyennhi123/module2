import java.util.Arrays;
import java.util.Scanner;

public class arrayPush {
    public static void main(String[] args) {
        int[] array = {6, 8, 3, 9, 7, 4, 5};

        Scanner input = new Scanner(System.in);
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.print("\nEnter value need insert: newValue = ");
        int newValue = input.nextInt();
        System.out.print("Enter index: indexPosition = ");
        int indexPosition = input.nextInt();

        array = insert(array, newValue,indexPosition);
        System.out.println("After inserting " + newValue + " at index " + indexPosition + " into array is:"
                + Arrays.toString(array));


    }

    public static int[] insert(int[] arr, int value, int index) {
        int[] result = new int[arr.length + 1];

        for (int i = 0, j = 0; i < arr.length; i++, j++){
            if (i == index){
                result[j] = value;
                j++;
            }
            result[j] = arr[i];
        }
        return result;
    }
}




