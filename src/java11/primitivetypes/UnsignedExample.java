package java11.primitivetypes;

public class UnsignedExample {

	public static void main(String[] args) {
		System.out.println(Integer.MIN_VALUE);
		int testInt = Integer.MAX_VALUE+3;
		System.out.println("Casting to an int, value = "+ testInt);
		
		long l = (long) Integer.MAX_VALUE+3;
		System.out.println("widening to long = " + l);
		
		int vInt = Integer.parseUnsignedInt(new String("" + ((long) (Integer.MAX_VALUE) + 3)));
		System.out.println(vInt);
	}
}
