package com.practice.string;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicatesChatGPT {

	public static void main(String[] args) {

		System.out.println("Enter the word");// aaabbcc
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine().replaceAll(" ", "");
		if (word.length() == 0) {
			System.out.println("No word entered");
			return;
		}
		Set<Character> unique = new LinkedHashSet<>();
		for (char ch : word.toCharArray()) {
			unique.add(ch);
		}
		for (char ch : unique) {
			System.out.print(ch);
		}

		sc.close();
	}

}
