package java11.assesments.adyen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FizzBuzz {

	public static void fizzBuzz(int n) {
		for (int i = 0; i <= n; i++) {
			boolean isMultiple3 = i % 3 ==0;
			boolean isMultiple5 = i % 5 ==0;
			
			if (isMultiple3 && isMultiple5) {
				System.out.println("FizzBuzz"); 				
			} else if ( isMultiple3) {
				System.out.println("Fizz"); 
			} else if ( isMultiple5) {
				System.out.println("Buzz"); 
			} else {
				System.out.println(i); 
			}			
			
		}
	}
	  
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        FizzBuzz.fizzBuzz(n);

        bufferedReader.close();
	}
}
