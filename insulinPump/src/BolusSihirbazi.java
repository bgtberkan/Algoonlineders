import java.text.DecimalFormat;
import java.util.Scanner;

public class BolusSihirbazi extends BolusManager{
        /*Bolus sihirbazını kullanmak için karbanhidrat sayımını bilmemiz gerekir. İnsülin pompasının, diyabetliye ne kadar
insülin yapması gerektiği konusunda tavsiyede bulunmasını sağlayan bir hesaplama yöntemidir. Diyabetlinin; Karbonhidrat
İnsülin Oranı, İnsülin Duyarlılık Faktörü, Aktif İnsülin Süresi gibi verileri pompa menüsüne girilir ve diyabetli her
bolus insülin gönderiminden önce pompaya kan şekeri ve alacağı karbonhidrat miktarını yazar ve bolus önerisi alır
     */

    public static void bolus(){
        Diyabetli Berkan = new Diyabetli(18.65,30 ,150 , 90);
        double toplamunite = 0;
        Scanner in = new Scanner(System.in);
        boolean durum = true;
        boolean durum2 = true;
        double yenitoplamunite = 0;
        System.out.println("Lütfen kan Şekerinizi giriniz");
        do {
            try {
                int kansekeri = in.nextInt();
                if( Berkan.hedefdegermin <= kansekeri && kansekeri <= Berkan.hedefdegermax  ){
                    durum = false;
                    System.out.println("Lütfen tüketilen krabanhidrat miktarını giriniz");
                    do {
                        try {
                            int karbanhidrat = in.nextInt();
                            double unitetuketilen = karbanhidrat / Berkan.KIO();
                            toplamunite = unitetuketilen;
                            durum2 = false;
                        }catch (Exception e){
                            System.out.println("Lütfen tüketilen karbanhidrat diğerini giriniz");
                            in.nextLine();
                        }
                    }while (durum2);
           /*burada bir küçük hesaplama kullanacğız çünkü yukarıdaki değişkenler virgülden sonra çok fazla hanesi olıyor
            ama biz bunu virgülden sonra tek haneye düşürmemiz lazım.
             */
                    final  int ondalikadedi = 1;
                    String ondalikBicimi = "##.";
                    for(int i = 1 ; i  <= ondalikadedi; i++){
                        ondalikBicimi += "#";
                    }
                    yenitoplamunite = Double.parseDouble(new DecimalFormat(ondalikBicimi).format(toplamunite).replace
                            (",","."));
                    System.out.println("Önerilen ünite: " + yenitoplamunite);
                }else if (Berkan.hedefdegermax < kansekeri) {
                    int fark = kansekeri - Berkan.hedefdegermax  ;
                    double unite =  (fark / Berkan.IDF());
                    durum = false;
                    System.out.println("Lütfen tüketilen krabanhidrat miktarını giriniz");
                    do {
                        try {
                            int karbanhidrat = in.nextInt();
                            double unitetuketilen = karbanhidrat / Berkan.KIO();
                            toplamunite = unitetuketilen + unite;
                            durum2 = false;
                        }catch (Exception e){
                            System.out.println("Lütfen tüketilen karbanhidrat diğerini giriniz");
                            in.nextLine();
                        }
                    }while (durum2);
                    final  int ondalikadedi = 1;
                    String ondalikBicimi = "##.";
                    for(int i = 1 ; i  <= ondalikadedi; i++){
                        ondalikBicimi += "#";
                    }
                    yenitoplamunite = Double.parseDouble(new DecimalFormat(ondalikBicimi).format(toplamunite).replace
                            (",","."));
                    System.out.println("Önerilen ünite: " + yenitoplamunite);
                } else {
                    int fark = Berkan.hedefdegermin - kansekeri;
                    double unite =  (fark / Berkan.IDF());
                    durum = false;
                    System.out.println("Lütfen tüketilen krabanhidrat miktarını giriniz");
                    do {
                        try {
                            int karbanhidrat = in.nextInt();
                            double unitetuketilen = karbanhidrat / Berkan.KIO();
                            toplamunite = unitetuketilen - unite;
                            durum2 = false;
                        }catch (Exception e){
                            System.out.println("Lütfen tüketilen karbanhidrat diğerini giriniz");
                            in.nextLine();
                        }
                    }while (durum2);
                    final  int ondalikadedi = 1;
                    String ondalikBicimi = "##.";
                    for(int i = 1 ; i  <= ondalikadedi; i++){
                        ondalikBicimi += "#";
                    }
                    yenitoplamunite = Double.parseDouble(new DecimalFormat(ondalikBicimi).format(toplamunite).replace
                            (",","."));
                    System.out.println("Önerilen ünite: " + yenitoplamunite);

                }
            }catch (Exception e){
                System.out.println("Lütfen kan şekerinizi giriniz");
                in.nextLine();
            }
        }while (durum);
        if (yenitoplamunite < 0){
            System.out.println("Düşük kan şekeri insülin yapılamaz lütfen 15/15 kuralını uygulayınız");
            System.exit(1);
        }
        else {
            int a = (int) (yenitoplamunite*10);
            int d = a / 10;
            for (int b = 0; b < d ; b++ ){
                System.out.print("*");
            }
            System.out.println();
            int c = a%10;
            for (int b = 0; b < c ; b++ ){
                System.out.print("-");
            }
        }
        System.out.println();
        AnaMenu.ekran();
    }
}
