package java11.functionalinterfaces;

public class FunctionalEnumTest {
	public static void main(String[] args) {
		System.out.println(FunctionalEnum.ADD.apply(5, 6));
		
		System.out.println(FunctionalEnum.MULTIPLY.apply(7, 8));
	}
}
