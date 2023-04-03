package sunum1;
import java.util.Scanner;
public class EnBuyuk {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        int a = in1.nextInt();
        int b = in2.nextInt();
        System.out.println(enBuyuk(a,b));
    }
    public static int enBuyuk(int i1 , int i2){
        int enBuyuk = 0;
        if ( i1 > i2 ){
            enBuyuk = i1;

        }
        else if (i1 < i2) {
            enBuyuk = i2;

        }
        else {
            System.out.println("Sayılar eşit");
        }
        return enBuyuk;
    }
}
