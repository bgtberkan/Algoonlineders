import java.util.Scanner;

public abstract class AnaMenu {
    public  static void ekran() {
        System.out.println("Lütfen yapılacak işlemi rakamlayın");
        System.out.println("Bolus: 1");
        System.out.println("Duraklatma: 2");
        System.out.println("Bazal: 3");
        System.out.println("Menüden çık: 4");
        Scanner in = null;
        boolean giris = true;
        do {
            try {
                in = new Scanner(System.in);
                int i = in.nextInt();
                giris = false;
                if(i == 1 || i == 2 || i == 3 || i == 4 ){
                    switch (i){
                        case 1 :
                            BolusMenu.BolusMenu();
                            break;
                        case 2 :
                            Duraklatma.Duraklatma();
                            break;
                        case  3 :
                            BazalMenu.BazalMenu();
                        case 4 :
                            System.exit(1);
                    }
                }
                else {
                    System.out.println("Lütfen gecerli işlemler için rakamlama yapın");
                    AnaMenu.ekran();
                }
            }catch (Exception e){
                System.out.println("Lütfen yapılacak işlem için rakamlama yapın");
                in.nextLine();
            }

        }while (giris);
    }
}
