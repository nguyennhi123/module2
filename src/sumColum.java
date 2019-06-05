import java.util.Scanner;

public class sumColum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][]arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("nhap so cot: ");
        int cot = scanner.nextInt();
        int sum = 0;
        for (int i = 0;i<3;i++){
                sum = sum + arr[i][cot];
            }
        System.out.println("tong cot "+ cot+ " la "+sum);
        }
    }

