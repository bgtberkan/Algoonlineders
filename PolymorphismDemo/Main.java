package PolymorphismDemo;

public class Main {
    public static void main(String[] args) {
       /* BaseLogger [] loggers = new BaseLogger[] {new FileLogger() , new EmailLogger() , new DatabaseLogger()};
        for (BaseLogger logger : loggers) {
            logger.log("log mesajı");
        } */
        //çok biçimliliğn olduğu yer tam olarak burası
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}
