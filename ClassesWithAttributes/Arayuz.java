package ClassesWithAttributes;

public class Arayuz {
    public static void main(String[] args) {
        Product product = new Product();
        product._name = "Laptop";
        product._description = "Asus";
        product._price = 50000;
        product.setId(5);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.get_kod());
    }
}
