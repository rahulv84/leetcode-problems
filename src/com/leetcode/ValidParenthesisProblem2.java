package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParenthesisProblem2 {

	private static Map<Character, Character> map = new HashMap<Character, Character>();
	
	static {
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');
	}
	
	
	public static void main(String[] args) {

		System.out.println("main started...");
		
		String s1 = "[{()}]"; // correct
		String s2 = "[{)(}]"; // incorrect
		String s3 = "[{({[]})}]"; // correct
		String s4 = "{[([{}))]}"; //incorrect
		
		long time = System.currentTimeMillis();
		
		System.out.println("s1 validity check: " + isValid(s1));
		
		System.out.println("time taken in ms -> " + (System.currentTimeMillis() - time));
		System.out.println("s2 validity check: " + isValid(s2));
		System.out.println("s3 validity check: " + isValid(s3));
		System.out.println("s4 validity check: " + isValid(s4));
	}  

	public static boolean isValid(String s) {

		boolean result = false;
		Stack<Character> stack = new Stack<Character>();
		
		
		if(s != null ) { //String should pass regex check as well to contain only {}[]()
			
			//System.out.println(s);
			char[] arr = s.toCharArray();
			
			//System.out.println("arr->" + arr.toString());
			
			for (char ch : arr) {
				
				//System.out.println("ch->" + ch);
									
				if(stack.isEmpty() || 
						map.get(stack.peek())== null ||
						((map.get(stack.peek())!= null)&&(!map.get(stack.peek()).equals(ch))) ) {
					stack.push(ch);
					//System.out.println("pushing to stack->"+ stack.toString());
				}
				else {
					stack.pop();
					//System.out.println("popping from stack->"+ stack.toString());
				}
				 
			}
			
			
			//at the end of for loop if stack is empty then it was correct string.
			if(stack.isEmpty()) {
				System.out.println("Stack is empty now, input was valid parenthesis -> " + s);
				result = true;
			}
			else {
				System.out.println("input is invalid parenthesis -> " + s);
			}
				
		}
		else
			System.out.println("input is null");
		return result;
		
	}
}
