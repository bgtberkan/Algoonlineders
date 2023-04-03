package sunum1;

public class SiraliToplam {
    public static void main(String[] args) {
        System.out.println(top(1,10));
    }
    public static  int top(int i, int k){
        int sonuc = 0;
        for (int x = i ; x <= k ; x++)
            sonuc = sonuc + x;
        return sonuc;
    }


}
