import java.util.Scanner;

public class newRectange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the width: ");
        int width = scanner.nextInt();
        System.out.println("enter the height: ");
        int height = scanner.nextInt();
        rectange1 rectange2 = new rectange1(width,height);
        System.out.println("rectange " + rectange2.display());
        System.out.println("area is: "+ rectange2.getArea());
        System.out.println("perimetter is: "+rectange2.getPerimetter());
    }
}