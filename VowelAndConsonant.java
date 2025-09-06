package com.practice.string;

import java.util.Scanner;

public class VowelAndConsonant {

	public static void main(String[] args) {
		System.out.println("Enter a word");
		Scanner sc = new Scanner(System.in);
		String word = (sc.nextLine()).toLowerCase().replaceAll(" ", "");
		if (word.length() == 0) {
			System.out.println("Empty String");
			return;
		}
		int vowels = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
					|| word.charAt(i) == 'u') {
				vowels++;
			}
		}

		System.out.println("Number of vowels are " + vowels);
		System.out.println("Number of consonants are " + (word.length() - vowels));

		sc.close();

	}

}
