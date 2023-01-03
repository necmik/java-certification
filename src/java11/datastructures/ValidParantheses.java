package java11.datastructures;

import java.util.Stack;

public class ValidParantheses {

	public static void main(String[] args) {
		System.out.println(isValid("()"));
	}
	
	public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            System.out.println(c);            
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
            System.out.println(stack);
        }
        return stack.isEmpty();
    }
}
