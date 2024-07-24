import java.text.DecimalFormat;


public class BazalManager {
    /*burada hasta bireylerin gün içerisinde kan şekerlerini düzenlemesi için insülin pompsının gün içerisinde
    otamatik olarak göndermesi gereken insülin oranı yer alıyor.
    Bazalın tam olarak nasıl çalıştığını bilmiyorum yani bize saniye olarak mı bu işlemi yapıyor ya da dakika mı ya da
    saat mi bilmiyorum ama ben bu snıfta daha önce oluşturduğumuz berkan nesnesinin özelliği olan bazalı alıp 24 e bölüp
    ekrana saatlik bazal dozunu yazdıracam.
     */
   public  static  void Bazal(){
       Diyabetli Berkan = new Diyabetli(18.65,30 ,150 , 100);
       double bazal = Berkan.getBazal()/24;
       final  int ondalikadedi = 1;
       String ondalikBicimi = "##.";
       for(int i = 1 ; i  <= ondalikadedi; i++){
           ondalikBicimi += "#";
       }
       /*burada bir küçük hesaplama kullanacğız çünkü yukarıdaki değişkenler vürgülden sonra çok fazla hanesi olıyor
            ama biz bunu virgülden sonra tek haneye düşürmemiz lazım.
             */
       double mevcutBazal = Double.parseDouble(new DecimalFormat(ondalikBicimi).format(bazal).replace
               (",","."));
       System.out.println("Mevcut bazal dozunuz: " + mevcutBazal + "'dır");
       AnaMenu.ekran();
   }
}
