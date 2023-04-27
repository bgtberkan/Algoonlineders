package AbstractClasses;

public class Main {
    public static void main(String[] args) {
        WomenGameCalculator womenGameCalculator = new WomenGameCalculator();
        womenGameCalculator.hesapla();
       // Abstract sınıfı newlersek bu şekilde olacak ama güzek bbir kullanım değildir
        // içini yazmamız lazım
        /*GameCalculator gameCalculator = new GameCalculator() {
            @Override
            public void hesapla() {

            }
        };*/
        // BU şekilde tutabiliyor
        GameCalculator gameCalculator = new WomenGameCalculator();
        gameCalculator.gameOver();

    }
}
