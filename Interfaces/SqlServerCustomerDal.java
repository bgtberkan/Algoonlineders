package Interfaces;

public class SqlServerCustomerDal implements ICostumerDal{
    @Override
    public void add() {
        System.out.println("SQL Server eklendi");
    }
}
