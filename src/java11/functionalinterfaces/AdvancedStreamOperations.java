package java11.functionalinterfaces;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AdvancedStreamOperations {

	public static void main(String[] args) {
		Stream<UUID> uuids = Stream.generate(UUID::randomUUID);
		uuids.limit(10).forEach(System.out::println);
		
		Stream<Character> alphabet = Stream.iterate('A', letter->letter <= 'Z', letter -> (char) (letter+1));
		alphabet.forEach(System.out::print);
		
		List<Product> products = Product.generateProducts();
		
		Map<Category, List<String>> productNamesByCategory = products.stream()
				.collect(Collectors.groupingBy(Product::getCategory, Collectors.mapping(Product::getName, Collectors.toList())));
		
		
	}
}
