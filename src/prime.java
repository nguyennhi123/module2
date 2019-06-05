
public class prime {
    public static void main(String[] args) {
for (int number = 0; number < 100 ; number++){
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
        }
    }
}
    }
}
