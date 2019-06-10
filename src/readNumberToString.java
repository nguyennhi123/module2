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
                    System.out.println("zero ");
                    break;
                case 1:
                    System.out.println("one ");
                    break;
                case 2:
                    System.out.println("two ");
                    break;
                case 3:
                    System.out.println("three ");
                    break;
                case 4:
                    System.out.println("four ");
                    break;
                case 5:
                    System.out.println("five ");
                    break;
                case 6:
                    System.out.println("six ");
                    break;
                case 7:
                    System.out.println("seven ");
                    break;
                case 8:
                    System.out.println("eight ");
                    break;
                case 9:
                    System.out.println("nine ");
            }
        }else if (number <20){
            String string ="";
            int mod = number%10;
            switch (mod){
                case 0:
                    System.out.println("ten ");
                    break;
                case 1:
                    System.out.println("eleven ");
                    break;
                case 2:
                    System.out.println("twelve ");
                    break;
                case 3:
                    System.out.println("thirteen ");
                    break;
                case 4:
                    System.out.println("fourteen ");
                case 5:
                    System.out.println("fifteen ");
                    break;
                case 6:
                    System.out.println("sixteen ");
                    break;
                case 7:
                    System.out.println("seventeen ");
                case 8:
                    System.out.println("eightteen ");
                    break;
                case 9:
                    System.out.println("nineteen ");
            }

        }
        else if (number<100){
            String string = "";
            int dozens = number/10;
            int units = number%10;
            switch (dozens){
                case 2:
                    string+="twenty ";
                    break;
                case 3:
                    string+="thirty ";
                    break;
                case 4:
                    string+="forty ";
                    break;
                case 5:
                    string+="fifty ";
                    break;
                case 6:
                    string+="sixty ";
                    break;
                case 7:
                    string+="seventy ";
                    break;
                case 8:
                    string+="eighty ";
                    break;
                case 9:
                    string+="ninety ";
            }
            switch (units){
                case 1:
                    string+="one ";
                    break;
                case 2:
                    string+="two ";
                    break;
                case 3:
                    string+="three ";
                    break;
                case 4:
                    string+="four ";
                    break;
                case 5:
                    string+="five ";
                    break;
                case 6:
                    string+="six ";
                    break;
                case 7:
                    string+="seven ";
                    break;
                case 8:
                    string+="eight ";
                    break;
                case 9:
                    string+="nine ";
            }
            System.out.println(string);
        }else if (number<1000){
        String string = "";
        int hundres = number/100;
        int dozens = (number-hundres*100)/10;
        int units = number%10;
        switch (hundres){
            case 1:
                string+="one hundres ";
                break;
            case 2:
                string +="two hundres ";
                break;
            case 3:
                string+="three hundres ";
                break;
            case 4:
                string+="four hundres ";
                break;
            case 5:
                string+="five hundres ";
                break;
            case 6:
                string+="six hundres ";
                break;
            case 7:
                string+="seven hundres ";
                break;
            case 8:
                string+="eight hundres ";
                break;
            case 9:
                string+="nine hundres ";

        }
        switch (dozens){
            case 2:
                string+="twenty ";
                break;
            case 3:
                string+="thirty ";
                break;
            case 4:
                string+="forty ";
                break;
            case 5:
                string+="fifty ";
                break;
            case 6:
                string+="sixty ";
                break;
            case 7:
                string+="seventy ";
            case 8:
                string+="eighty ";
                break;
            case 9:
                string+="ninety ";
        }
        switch (units) {
            case 1:
                string += "one ";
                break;
            case 2:
                string += "two ";
                break;
            case 3:
                string += "three ";
                break;
            case 4:
                string += "four ";
                break;
            case 5:
                string += "five ";
                break;
            case 6:
                string += "six ";
                break;
            case 7:
                string += "seven ";
                break;
            case 8:
                string += "eight ";
                break;
            case 9:
                string += "nine ";
        }
            System.out.println(string);
        }
    }

}
