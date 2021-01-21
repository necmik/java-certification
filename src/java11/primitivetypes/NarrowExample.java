package java11.primitivetypes;

public class NarrowExample {

	public static void main(String[] args) {
		System.out.println("A byte has a range of "+ Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
		System.out.println("A char has a range of "+ (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
		
		byte b = 127;
		char c = 65535;
		
		//byte b1 = 128;
		//char c1 = 65535;
		
		int myInt = 1;
		//byte b2 = myInt;
		//char c2 = myInt;
	}
}
