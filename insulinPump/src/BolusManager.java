import java.util.Scanner;
/* İnsülin pompamız herhangi bir motora bağlıyamıyacağım için şöyle bir yol izliyeceğim
yapılmak istenen doz 5.8 ünite diyelim tam kısmı ifade edebilmek için * ifadesini kullanacağız ve ondalık kısmı ise / ile
ifade edeceğiz.
Hastanın da çok fazla ünite insülin yaparak hipoglisemiye girmesini istemiyeceğimiz için biz yapılacak üniteye bir
kısıtlama getirelim. Bu kısıtlama ben de 10 ünite yani tek bir seferde 10 ünite insülin yapabilirim
burada da bunu yapacağız.
 */

public class BolusManager {
    public static void bolus(){
        boolean durum = true;
        Scanner in = new Scanner(System.in);
        final double sinir = 10.0;
        do {
            try {
                System.out.println("Lütfen yapmak istediğiniz insülin ünitesini ayarlayın");
                double i = in.nextDouble();
                durum = false;
                if(i <= sinir & i > 0 ){
                    int a = (int) (i*10);
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
                else {
                    System.out.println();
                    System.out.println("Lütfen maksimum insülin ünetsini geçmeyiniz");
                    bolus();
                }
                System.out.println();
            }catch (Exception e){
                System.out.println("Lütfen geçerli doz giriniz1:");
                in.nextLine();
            }
        }while (durum);
        System.out.println();
        AnaMenu.ekran();

    }
}
