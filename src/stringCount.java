import java.util.Scanner;

public class stringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chuoi = "codegymcodegym";
        System.out.println("nhap 1 ki tu: ");
        char kitu = scanner.next().charAt(0);
        System.out.println(kitu+" xuat hien "+count(chuoi,kitu)+" lan");
    }
    public static int count(String string,char X){
        int count = 0;
        for (int i = 0; i < string.length();i++){
            if(string.charAt(i)==X){
                count++;
            }
        }return count;

    }




}
