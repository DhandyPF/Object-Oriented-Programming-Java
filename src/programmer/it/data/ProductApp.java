package programmer.it.data;

public class ProductApp {
    static void main() {
        Product product = new Product("Teh jus", 3000);

        System.out.println(product.name);
        System.out.println(product.price);
    }
}
