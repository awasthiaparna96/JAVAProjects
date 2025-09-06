package com.practice.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {

		System.out.println("Enter the string to be reversed");
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		char[] array = word.toCharArray();
		char temp = 0;
		for (int i = 0; i < array.length / 2; i++) {
			temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
		word = new String(array);
		System.out.println("The reversed word is " + word);

		// System.out.println("Reversed: " + new StringBuilder(word).reverse());
		sc.close();

	}

}
