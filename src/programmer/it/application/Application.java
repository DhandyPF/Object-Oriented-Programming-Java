package programmer.it.application;

import programmer.it.data.*;

public class Application {
    static void main() {
        Product product = new Product("Teh Gelas", 3000);

        System.out.println(product.name);
        System.out.println(product.price);

        Data data = new Data();
    }
}
