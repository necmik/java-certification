package java11.functionalinterfaces;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class MyFunctionTest {

	public static void main(String[] args) {
		Function<Integer, Integer> square = (s) -> s*s;
		System.out.println(square.apply(10));
		
		BiFunction<Integer, Integer, Integer> bf = (a,b) -> a+b;
		System.out.println(bf.apply(10, 20));
		
		Consumer<String> c = (s) -> System.out.println(s);
		c.accept("Hello");
		
		Consumer<String> t = (s) -> c.accept(s);
		t.accept("Necmi");
	}
}
