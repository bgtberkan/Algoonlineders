package Interfaces;

public class MySqlCustomerDal implements ICostumerDal , Irepository{
    @Override
    public void add() {
        System.out.println("My Sql eklendi");
    }
}
