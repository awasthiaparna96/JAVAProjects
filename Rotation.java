package com.practice.string;

import java.util.Scanner;

public class Rotation {

	public static void main(String[] args) {
		System.out.println("Enter the two strings to be compared for rotation");
		Scanner sc = new Scanner(System.in);
		String word1 = sc.nextLine();
		String word2 = sc.nextLine();
		if (word1.length() != word2.length()) {
			System.out.println("Word 2 is not a rotation of word 1");
			return;
		}

		if ((word1 + word1).contains(word2)) {
			System.out.println("word 2 is a rotation of word 1");
		} else {
			System.out.println("word 2 is not a rotation of word 1");
		}
		sc.close();
	}

}
