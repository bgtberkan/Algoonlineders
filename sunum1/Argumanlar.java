package sunum1;

public class Argumanlar {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Metot öncesi x: " + x);
        arttirma(x);
        System.out.println("Metot sonrası x: " + x);

    }
public static void arttirma(int k){
        k++;
        System.out.println("Metot içindeyiz x: " + k );
    }
}
