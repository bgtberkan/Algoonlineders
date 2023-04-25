package ClassesWithAttributes;

public class Product {
   String _name;
    String _description;
    double _price;
    int stock;
   private int _id;
   private String _kod;

   public int getId(){
       return _id;
   }
   public void setId(int id){
       //this.id =id yapabiliriz ama _ daha profesyonel
       _id=id;
   }
   public String get_kod(){
       return _name.substring(0,1)+_id;
   }

}
