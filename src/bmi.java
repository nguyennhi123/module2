import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        double height,weight,bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the weight: ");
        weight = scanner.nextDouble();
        System.out.println("enter the height: ");
        height = scanner.nextDouble();
        bmi = weight/Math.pow(height,2);
        if(bmi < 18.5){
            System.out.println("bmi: "+ bmi + "underweight");
        }else if(bmi < 25){
            System.out.println("bmi: "+ bmi + "nomal");
        }else if(bmi < 30){
            System.out.println("bmi: "+ bmi + "overweight");
        }else {
            System.out.println("bmi: "+ bmi + "obese");
        }
    }
}
