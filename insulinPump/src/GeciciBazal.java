import java.util.Scanner;

public class GeciciBazal extends BazalManager{
    /*Diyabetli bireyler spor yaparken ya da yürüyüşe çıktıklarında hareket ettikleri için kan şekerleri düşebilir bunun
     engellemek için mevcut bazal dozunu azaltmak istiyebilirler bu sınıfta bunu sağlıyacağız
     */
    public static void bazal(){
        Scanner in = new Scanner(System.in);
        boolean durum = true;
        do{
            try {
                System.out.println("Lütfen geçici bazal dozunuzu ayarlayın");
                double doz = in.nextDouble();
                durum = false;
                if (doz < 0.8 ){
                    System.out.println("gecici bazal ayarınız: " + doz + " olarak ayarlandı");
                }
                else{
                    System.out.println("gecici bazal doz mevcut bazal dozdan daha düşük olmalıdır");
                    System.out.println("mevcut bazal dozunuz: 0,8");
                    bazal();
                }
            }catch (Exception e){
                System.out.println("Gecerli doz giriniz");
                in.nextLine();
            }
        }while (durum);
        AnaMenu.ekran();
    }
}
