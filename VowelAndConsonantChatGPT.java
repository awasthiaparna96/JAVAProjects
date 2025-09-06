package com.practice.string;

import java.util.Scanner;

public class VowelAndConsonantChatGPT {

	public static void main(String[] args) {
		System.out.println("Enter a word");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine().toLowerCase();

		if (word.trim().length() == 0) {
			System.out.println("Empty String");
			sc.close();
			return;
		}

		int vowels = 0, consonants = 0;

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (Character.isLetter(ch)) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;
				} else {
					consonants++;
				}
			}
		}

		System.out.println("Number of vowels: " + vowels);
		System.out.println("Number of consonants: " + consonants);

		sc.close();
	}
}
