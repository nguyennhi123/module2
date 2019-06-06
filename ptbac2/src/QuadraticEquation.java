import java.util.Scanner;

public class QuadraticEquation {
    double a,b,c;
    public QuadraticEquation(){

    }
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;

    }
    double deta;
    public double getDiscriminant(){
        deta =  (Math.pow(this.b,2)-4*this.a*this.c);
        return deta;
    }

    public double getRoot1(){
        double r1 = ((-this.b+Math.pow(deta,0.5))/(2*this.a));
        return r1;

    }

    public double getRoot2(){
        double r2 = ((-this.b-Math.pow(deta,0.5))/(2*this.a));
        return r2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap number1:");
        double number1 = scanner.nextDouble();
        System.out.println("nhap number2: ");
        double number2 = scanner.nextDouble();
        System.out.println("nhap number3: ");
        double number3 = scanner.nextDouble();
        QuadraticEquation result = new QuadraticEquation(number1,number2,number3);
        double deta = result.getDiscriminant();
        System.out.println(deta);
        double r1 = result.getRoot1();
        double r2 = result.getRoot2();
        if(deta > 0){
            System.out.println(r1);
            System.out.println(r2);
        }else if(deta == 0){
            System.out.println(r1);
        }else {
            System.out.println("The equation has no roots");
        }
    }

}




