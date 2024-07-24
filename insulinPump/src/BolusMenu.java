import java.util.Scanner;
public class BolusMenu {
  public static void BolusMenu(){
      System.out.println("Lütfen yapılacak işlemi rakamlayın");
      System.out.println("Bolus Sihirbazı: 1");
      System.out.println("Normal Bolus: 2");
      System.out.println("Yayma Bolus: 3");
      System.out.println("İkili bolus: 4");
      System.out.println("Ana menüye dön: 5 ");
      Scanner in = null;
      boolean giris = true;
      do {
          try {
              in = new Scanner(System.in);
              int i = in.nextInt();
              giris = false;
              if(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 ){
                  switch (i){
                      case 1 :
                          BolusSihirbazi.bolus();
                          break;
                      case 2 :
                          NormalBolus.bolus();
                          break;
                      case  3 :
                          YaymaBolus.bolus();
                          break;
                      case 4 :
                          IkiliBolus.bolus();
                          break;
                      case 5 :
                          System.out.println("Ana menüye dönülüyor");
                          AnaMenu.ekran();
                  }
              }
              else {
                  System.out.println("Lütfen gecerli işlemler için rakamlama yapın");
                  BolusMenu.BolusMenu();
              }
          }catch (Exception e){
              System.out.println("Lütfen yapılacak işlem için rakamlama yapın");
              in.nextLine();
          }
      }while (giris);
   }
}
