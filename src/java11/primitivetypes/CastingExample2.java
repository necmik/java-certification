package java11.primitivetypes;

public class CastingExample2 {

	
	public static void main(String[] args) {
		
		int min = Short.MIN_VALUE - 1;
		
		short s = (short) min;
		
		System.out.println(s);
	}
}
