package Interfaces;

public class Main {
    public static void main(String[] args) {
       /* ICostumerDal costumerDal = new OracleCustomerDal();
        costumerDal.add();*/
        //1. yolun kodu
       /*  CustomerManager customerManager = new CustomerManager();
        customerManager.costumerDal = new SqlServerCustomerDal();
        customerManager.add();*/
        //2. yol
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();

    }
}
