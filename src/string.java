import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("Enter a name’s student:");
        String input_name = string.nextLine();
        if(compare(input_name,students)==-1){
            System.out.println("no found");
        }else {
            System.out.println(compare(input_name,students)+1);
        }
    }

    public static int compare(String name,String[]array) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (name.equals(array[i])) {
                index = i;

            }
        }
        return index;
    }
}

