package Interfaces;
public class CustomerManager {
    private ICostumerDal costumerDal;
   //2. yol
    public CustomerManager(ICostumerDal costumerDal){
        this.costumerDal = costumerDal;

    }

    public void add(){
        //iş kodları yazılır daldaki add çağracağız
        /*geçmiş olsun bağımlısın
        OracleCustomerDal oracleCustomerDal = new OracleCustomerDal();*/
      costumerDal.add();

    }
}
