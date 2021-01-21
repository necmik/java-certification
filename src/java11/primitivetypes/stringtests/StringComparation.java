package java11.primitivetypes.stringtests;

public class StringComparation {

	public static void main(String[] args) {
		String s1 = "XXX";
		String s2 = "XXX";
		
		System.out.println(s1 == s2);
		
		String s3 = new String("XXX");
		String s4 = new String("XXX");
		
		System.out.println(s3 == s4);
		
		String s5 = "YYY";
		String s6 = s5;
		System.out.println(s5 == s6);
		
		s6 = "YYZZ";
		System.out.println("s5 = "+ s5);
		System.out.println(s5 == s6);
		
		String s7 = new String("AAA");
		String s8 = s7;
		System.out.println(s7 == s8);
		
		s8 = "BBB";
		System.out.println("s7 = "+ s7);
		System.out.println("s8 = "+ s8);
		System.out.println(s7 == s8);
		
	}
}
