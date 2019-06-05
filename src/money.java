import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        System.out.println("nhap USD: ");
        int USD = scanner.nextInt();
        int VND = USD*rate;
        System.out.println(USD +" USD"+ "=" + VND +" VND");
    }
}
