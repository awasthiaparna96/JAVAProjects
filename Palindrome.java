package com.practice.string;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int count = word.length() / 2;
		for (int i = 0; i < word.length() / 2; i++) {
			if (word.charAt(i) == word.charAt(word.length() - 1 - i)) {
				count--;
			}
		}
		if (count == 0) {
			System.out.println("It's is a palindrome");
		} else {
			System.out.println("It's is not a palindrome");
		}
	}

}
