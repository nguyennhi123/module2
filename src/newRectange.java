import java.util.Scanner;

public class newRectange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the width: ");
        int width = scanner.nextInt();
        System.out.println("enter the height: ");
        int height = scanner.nextInt();
        rectange rectange1 = new rectange(width,height);
        System.out.println("rectange " + rectange1.display());
        System.out.println("area is: "+ rectange1.getArea());
        System.out.println("perimetter is: "+rectange1.getPerimetter());
    }
}
