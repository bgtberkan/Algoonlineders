package sunum1;
import java.util.Scanner;

public class NotGetir {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        double i = in1.nextInt();
        notGetir(i);
    }
    public static  void notGetir(double not){
        
        if(not < 0 || not > 100 ){
            System.out.println("Gecersiz not");
        }
        else if (not >= 90.0) {
            System.out.println("A");
        } else if ( not >= 80.0) {
            System.out.println("B");
        }
        else if (not >= 70.0) {
            System.out.println("C");
        } else if ( not >= 50) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
}
