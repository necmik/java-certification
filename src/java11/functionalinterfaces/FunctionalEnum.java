package java11.functionalinterfaces;

import java.util.function.BiFunction;

public enum FunctionalEnum {

	ADD((x,y) -> x + y),
	SUBTRACT((x,y) -> x - y),
	MULTIPLY((x,y) -> x * y);
	
	FunctionalEnum(BiFunction<Integer, Integer, Integer> operation) {
		this.operation = operation;
	}
	
	private final BiFunction<Integer, Integer, Integer> operation;
	
	public int apply(int x, int y) {
		return operation.apply(x, y);
	}
}
