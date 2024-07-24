import java.util.Scanner;

public class BazalMenu {
   public static void BazalMenu(){
        System.out.println("Lütfen yapılacak işlemi rakamlayın");
        System.out.println("Geciçi bazal ayarla: 1");
        System.out.println("Bazal İnceleme: 2");
        System.out.println("Ana Menüye dönme: 3 ");
       Scanner in = null;
       boolean giris = true;
       do {
           try {
               in = new Scanner(System.in);
               int i = in.nextInt();
               giris = false;
               if(i == 1 || i == 2 || i ==3){
                   switch (i){
                       case 1 :
                           GeciciBazal.bazal();
                           break;
                       case 2 :
                          BazalManager.Bazal();
                           break;
                       case  3 :
                           AnaMenu.ekran();
                   }
               }
               else {
                   System.out.println("Lütfen gecerli işlemler için rakamlama yapın");
                   BazalMenu();
               }
           }catch (Exception e){
               System.out.println("Lütfen yapılacak işlem için rakamlama yapın");
               in.nextLine();
           }

       }while (giris);
    }
}
