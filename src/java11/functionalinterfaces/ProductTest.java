package java11.functionalinterfaces;

import java.util.function.Consumer;

class Product {
    int id;
 
    Product(int id) {
        this.id = id;
    }
 
    public String toString() {
        return "Product " + id;
    }
}

public class ProductTest {
	public static void main(String[] args) {
        Product product = new Product(1);
 
        Consumer<Product> consumerD = p -> System.out.println(p.id);
        consumerD.accept(product);
        
        Consumer<Product> consumerE = (Product p) -> System.out.println(product.id);
        consumerE.accept(new Product(2));

        
    }
}
