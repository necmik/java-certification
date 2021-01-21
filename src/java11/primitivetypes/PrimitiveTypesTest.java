package java11.primitivetypes;

public class PrimitiveTypesTest {

	public static void main(String[] args) {
		double d = 127d;
		float f = 127f;
		double d2 = 'a';
		byte b = 'z';
		char c = 99;
		
		byte b2 = '\u007C';
		
		long l = 1_000_000L;
		
		int z;
		
		System.out.println(d);
		System.out.println(f);
		System.out.println(d2);
		System.out.println(b);
		System.out.println(c);
		System.out.println(b2);
		System.out.println(l);
		//must be initialized
		//System.out.println(z);
		
		int i,j,k = 10;
		System.out.println(k);
		//System.out.println(j);
	}
}
