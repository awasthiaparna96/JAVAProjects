package com.practice.string;

import java.util.HashMap;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {

		System.out.println("Enter two Strings to be compared for anagram");
		Scanner sc = new Scanner(System.in);
		String word1 = sc.nextLine();
		String word2 = sc.nextLine();

		char[] array1 = word1.toCharArray();
		char[] array2 = word2.toCharArray();

		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();

		for (char character : array1) {
			map1.put(character, map1.getOrDefault(character, 0) + 1);
		}

		for (char character : array2) {
			map2.put(character, map2.getOrDefault(character, 0) + 1);
		}

		if (map1.equals(map2)) {
			System.out.println("It is an anagram");
		} else {
			System.out.println("Not an anagram");
		}
	}

}
