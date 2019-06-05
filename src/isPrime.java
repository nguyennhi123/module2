import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the nuber: ");
        int number = scanner.nextInt();
        if(number <2){
        System.out.print(number+" is not prime");
        }
        if(number >= 2){
            int i = 2;
            boolean check = true;
            while (i<= Math.sqrt(number)){
                if(number%i == 0){
                    check = false;
                    break;
                }
                i++;
                }
            if(check){
                System.out.print(number+" is prime");
            }else {
                System.out.print(number+" is not prime");
            }
        }
    }
}
