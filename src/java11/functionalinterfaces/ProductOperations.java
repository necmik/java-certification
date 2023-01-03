package java11.functionalinterfaces;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class ProductOperations {

	private static Optional<Product> filterProduct(List<Product> products, 
			Predicate<Product> filter) {
		
		for (Product product : products) {
			if (filter.test(product)) return Optional.of(product);
		}
		return Optional.empty();
	}
	
	public static void main(String[] args) {
		List<Product> products = Product.generateProducts();
		
		Optional<Product> filteredProduct = filterProduct(products, (product) ->product.getName().equals("Book"));
		
		System.out.println(filteredProduct.isPresent() ? filteredProduct.get().getPrice() : "null");
		
		BigDecimal priceLimit = new BigDecimal(20);
		
		// Functional composition
		Predicate<Product> isFood = product -> product.getCategory() == Category.FOOD;
		Predicate<Product> isCheap = product -> product.getPrice().compareTo(priceLimit) < 0;
		
		filterProduct(products, isFood.and(isCheap))
			.ifPresentOrElse(
					product -> System.out.printf("%s is cheap food for $ %.2f%n", product.getName(), product.getPrice()),
					()-> System.out.println("There are no cheap food products"));
	}
}
