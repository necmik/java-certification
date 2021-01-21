package java11.primitivetypes;

public class BinaryExample {

	public static void main(String[] args) {
		byte byte1 = (byte) 0b01111111; //127
		byte byte2 = (byte) 0b10000000; //-128
		byte byte3 = (byte) 0b00100001; //33
		
		short short1 = (short) 0b10100001_01000101; //-24251
		
		System.out.println("byte1 = " + byte1);
		System.out.println("byte2 = " + byte2);
		System.out.println("byte3 = " + byte3);
		
		System.out.println("short1 = "+ short1);
	}
}
