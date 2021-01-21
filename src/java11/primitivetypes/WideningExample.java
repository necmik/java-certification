package java11.primitivetypes;

public class WideningExample {

	public static void main(String[] args) {
		
		byte myByte = 0;
		int myInt = 0;
		double myDouble = 0.0;
		float myFloat = 0.0f;
		
		myDouble = myFloat = myInt = myByte;
		
		System.out.println("Happy Widening");
	}
}
