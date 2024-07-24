import java.util.Scanner;

public class IkiliBolus extends BolusManager {
    /*İkili Bolus : Şeker yükseltme hızı birbirinden farklı olan (çok hızlı ve çok yavaş) karbonhidratların aynı anda
tüketilmesi durumunda insülinin bir bölümünün hemen, geri kalan bölümünün zamana yayılarak gönderilmesini sağlayan
alternatif bir insülin gönderme yönetimidir.
Çalışma prensibi ise şöyle anlatabiliriz 8 ünitelik bir insülin yapılacak ve bu insülinin ilk başta kullanıcının
ayarlamış olduğu oranda göndermesi aradan yine kullanıcıyın belirlediği süre sonra kalan insülin miktarını gödermeyi
sağlar.
     */
    public static void bolus(){
        boolean durum = true;
        Scanner in = new Scanner(System.in);
        do {
            try {
            System.out.println("Lütfen yapmak istediğiniz insülin ünitesini ayarlayın");
            double topin = in.nextDouble();
            durum = false;
            boolean durum2 = true;
            do {
                try {
                    System.out.println("Lütfen ilk gönerilecek ünite miktarını giriniz ");
                    double ilk = in.nextDouble();
                    durum2 = false;
                    if(topin <= 10 & topin > 0 ){
                        int j = (int) (ilk*10);
                        int d = j / 10;
                        for (int b = 0; b < d ; b++ ){
                            System.out.print("*");
                        }
                        System.out.println();
                        int c = j%10;
                        for (int b = 0; b < c ; b++ ){
                            System.out.print("-");
                        }
                        System.out.println();
                        System.out.println("Kalan doz: " + (topin-ilk) + "'dır"  );
                    }
                    else {
                        bolus();
                    }
            }catch (Exception e){
                    System.out.println("Lütfen geçerli doz giriniz");
                    in.nextLine();
                }

            }while (durum2);
        }catch (Exception exception){
            System.out.println("Lütfen geçerli doz giriniz");
            in.nextLine();
        }
        }while (durum);
        AnaMenu.ekran();
    }
}
