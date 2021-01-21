package java11.primitivetypes;

public class CastingExample {

	public static void main(String[] args) {
		
		short s2;
		int loopIterations = 0;
		
		int minValue = Short.MIN_VALUE;
		int maxValue = Short.MAX_VALUE;
		
		for (int i = minValue; i <= maxValue; i++) {
			s2 = (short) i;
			
			if (i == minValue) System.out.println("Minimum Short value = " + s2);
			if (i == maxValue) System.out.println("Maximum Short value = " + s2);
			
			callAMethod((loopIterations +1 ), s2);
			loopIterations++;
		}
		
		System.out.println("loopOperations = "+ loopIterations);
	}

	private static void callAMethod(int i, short s) {
		if (s == Short.MAX_VALUE) System.out.println("Iteration " + i + " had the max value, my type is short");
		
	}
}
