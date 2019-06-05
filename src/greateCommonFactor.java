public class greateCommonFactor {
    public static void main(String[] args) {
        int a, b;
        java.util.Scanner nhap = new java.util.Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = nhap.nextInt();
        System.out.println("Enter the second number: ");
        b = nhap.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);
        if(a == 0 && b == 0){
            System.out.println("No greatest common factor");
        }

        if (a == 0 && b != 0)
            System.out.println("Greatest common factor: " + b);
        if (b == 0 && a != 0)
            System.out.println("Greatest common factor: " + a);


        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }

        System.out.println("Greatest common factor: " + a);

    }
}
