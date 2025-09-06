package com.practice.string;

import java.util.Scanner;

public class PalindromeChatGPT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String word = sc.nextLine();
		
		boolean isPalindrome = true;
		for (int i = 0; i < word.length() / 2; i++) {
			if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
				isPalindrome = false;
				break;
			}
		}

		if (isPalindrome) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}
		
		sc.close();
	}
}
