import java.util.Scanner;

public class readNumberToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number: ");
        int number = scanner.nextInt();
        if (number < 0 || number > 1000){
            System.out.println("out of ability");
        }else if (number <10){
            switch (number){
                case 0:
                    System.out.println("zero");
                case 1:
                    System.out.println("one");
                case 2:
                    System.out.println("two");
                case 3:
                    System.out.println("three");
                case 4:
                    System.out.println("four");
                case 5:
                    System.out.println("five");
                case 6:
                    System.out.println("six");
                case 7:
                    System.out.println("seven");
                case 8:
                    System.out.println("eight");
                case 9:
                    System.out.println("nine");
            }
        }else if (number <20){
            String string ="";
            int mod = number%10;
            switch (number){
                case 0:
                    System.out.println("ten");
                case 1:
                    System.out.println("eleven");
                case 2:
                    System.out.println("twelve");
                case 3:
                    System.out.println("thirteen");
                case 4:
                    System.out.println("fourteen");
                case 5:
                    System.out.println("fifteen");
                case 6:
                    System.out.println("sixteen");
                case 7:
                    System.out.println("seventeen");
                case 8:
                    System.out.println("eightteen");
                case 9:
                    System.out.println("nineteen");
            }

        }
        else if ()
    }
}
