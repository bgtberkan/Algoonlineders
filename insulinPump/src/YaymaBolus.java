import java.util.Scanner;

public class YaymaBolus extends BolusManager{
    /*Bazen yediğimiz yiyecekler yağlı olabilir ve yağ insülin etki süresini yavaşlatır ve insülin pompası kullanan
insanlar farklı insülin yapılış şekillerine ihtiyac duyar bu da onlardan birisi pompa burada insülini bellirlediğimiz
saat içerisinde yapar örneklendirecek olursak 6.3 üniteyi bir saat içerisinde yavaş yavaş vüculda göndererek yapar
normal bolustan farkı normal bolus ayarlanan insülin miktarını hemen gönderirken burada bellirlediğimiz zaman diliğminde
yapıyor oluşudur.
     */

    public static void bolus(){
        Scanner in = new Scanner(System.in);
        boolean durum = true;
        do {
            try {
                System.out.println("Lütfen yapmak istediğiniz insülin ünitesini ayarlayın");
                double a = in.nextDouble();
                durum = false;
                boolean yenidurum = true;
                do{
                try {
                    System.out.println("Lütfen gönderilecek saat süresini seciniz");
                    double saat = in.nextDouble();
                    yenidurum = false;
                    System.out.println("Yapılacak ünite " + a + " gönderim süresi: " + saat);
                } catch (Exception e) {
                    System.out.println("Lütfen geçerli saat giriniz");
                    in.nextLine();
                 }
                }while (yenidurum);
            } catch (Exception e) {
                System.out.println("Lütfen geçerli doz giriniz");
                in.nextLine();
            }
        }while (durum);
        AnaMenu.ekran();
    }
}
