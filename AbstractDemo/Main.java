package AbstractDemo;

public class Main {
    public static void main(String[] args) {
        //Bu şekilde oracle ya da sql arasında tercih yapabiliriz
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new OracleDatabaseManager();
        customerManager.getCustomer();

    }
}
