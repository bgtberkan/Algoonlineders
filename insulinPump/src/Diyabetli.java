public class Diyabetli {
    private double bazal;
    double top; //bu değişken bireyin gün içerisinde toplam kaç ünite insülin yapıyor onun için
   int hedefdegermax;// diyabetli insanların kan şekerinin olmasını istediği değerdir doktor önerir.
    int hedefdegermin;
    Diyabetli(double bazal , double top , int hedefdegermax, int hedefdegermin){
        this.bazal = bazal;
        this.top = top;
        this.hedefdegermax = hedefdegermax;
        this.hedefdegermin = hedefdegermin;
    }
    /* burada diyabetli bireyin insülin duyarlılık faktörünü(İDF) hesaplıyacağız
    İDF: bir ünite insülin ne kadar kan şekerini düşürüyor.
    İDF hesaplanırken 1500-1800 Kuralı ile hesaplanır. Yani günlük toplam insülinlerimizi 1500 ya da 1800 değerine
    böldüğümüzde ortaya çıkan değer İDF değeridir. Biz hesaplamalarımızda daha
    ortalama bir değer elde edebilmek için 1700 sayısıyla çalışayım
     */
    public double IDF(){
        final int sabit = 1700;
        final  double idf = sabit/top;
        return idf;
    }
    /*burada ise karbonhidrat/insülin(KIO) oranını hesaplayacağız.
    KIO: kaç gr karbanhidrata kaç ünite yapılması gerekir onu hesaplayacağız.
    Bu oranın hesaplanması için ise kullanılacak sabit değer 500. Sabit değer olan 500’ü yine günlük toplam insülin
    değerine  bölüyoruz.
     */
    public double KIO(){
        final int sabit = 500;
        final double kio = sabit/top;
        return kio;
    }

    public double getBazal() {
        return bazal;
    }
}
