package java11.functionalinterfaces;

import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class ProductStreamOperations {

	public static void main(String[] args) {
		List<Product> products = Product.generateProducts();
		
		Stream<Product> productStream = products.stream();
		
		Stream<String> stream2 = Stream.of("one", "two", "three");
		
		Stream<?> strem3 = Stream.empty();
		
		// Filtering
		productStream
			.filter(product -> product.getCategory() == Category.FOOD)
			.forEach(System.out::println);
		
		System.out.println("-----------------");
		products.stream()
			.map(product -> String.format("The price of %s is $ %.2f", product.getName(), product.getPrice()))
			.forEach(System.out::println);
		
		System.out.println("-----------------");
		Pattern spaces = Pattern.compile("\\s+");
		products.stream()
			.flatMap(product -> spaces.splitAsStream(product.getName()))
			.forEach(System.out::println);
		
		System.out.println("-----------------");
		// Searching
		Optional<Product> opt = products.stream()
			.filter(product -> product.getCategory() == Category.STATIONERY)
			.findAny(); //findFirst();
		opt.ifPresent(System.out::println);
	}
}
