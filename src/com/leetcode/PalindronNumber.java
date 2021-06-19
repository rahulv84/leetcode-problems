package com.leetcode;

public class PalindronNumber {
	
	public static void main(String[] args) {
		System.out.println("is 12321 a palindrome: " + isPalindrome(12321));
		System.out.println("is 12321 a palindrome: " + isPalindrome(12322));
	}
	

	public static boolean isPalindrome(int x) {

		boolean isPalindrome = false;
		
		//String forward = String.valueOf(x);
		String forward = ""+x;
		
		char [] chars = forward.toCharArray(); 
		StringBuilder strBldr = new StringBuilder();
		
		for(int i=chars.length; i>0; i--) {
			strBldr.append(chars[i-1]);
		}
		
		String backward = strBldr.toString();
		
		if(forward.equals(backward))
			isPalindrome = true;
		return isPalindrome;
	}
}
