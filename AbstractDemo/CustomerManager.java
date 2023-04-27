package AbstractDemo;

public class CustomerManager {
    //bir dile bağlı kalmak istemiyorsan böyle yaz
    BaseDatabaseManager databaseManager;
    public void getCustomer(){
        //Geçmiş olsun oracle bağlı kalırsın böyle
       /* OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
        oracleDatabaseManager.getData();*/

        databaseManager.getData();
    }
}
