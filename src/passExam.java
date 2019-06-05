import java.util.Scanner;

public class passExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the size: ");
        int size = scanner.nextInt();
        int[]arr;
        arr = new int[size];
        for(int i = 0; i < arr.length;i++){
            System.out.println("enter the point "+(i+1)+ " :");
            arr[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ "\t");

            if (arr[i] >= 5 && arr[i] <= 10){
                count++;
            }
        }
        System.out.println("The number of students passing the exam is "+ count);



    }
}
