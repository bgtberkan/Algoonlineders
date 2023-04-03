package sunum1;
import java.util.Scanner;

public class ParametreSirasi{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        sms("Merhaba", i);
    }
    public static void sms(String mesaj , int i){
        for (int k = 0 ; k < i ; k++ ){
            System.out.println(mesaj);
        }
    }
}
