import java.util.Scanner;

public class prime20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number: ");
        int newNumber = scanner.nextInt();
        int count = 0;

        for (int number = 0; count < newNumber ; number++){
            boolean check = true;
            if(number <2){
                check = false;
            }
            if(number >= 2){
                int i = 2;
                while (i<= Math.sqrt(number)){
                    if(number%i == 0){
                        check = false;
                        break;
                    }
                    i++;
                }
                if(check){
                    System.out.println(number);
                    count++;
                }
            }
        }
        }
    }

