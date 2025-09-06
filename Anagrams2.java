package com.practice.string;

import java.util.HashMap;
import java.util.Scanner;

public class Anagrams2 {

	public static void main(String[] args) {

		System.out.println("Enter two strings to be compared");
		Scanner sc = new Scanner(System.in);
		String word1 = sc.nextLine();
		String word2 = sc.nextLine();

		if (word1.length() != word2.length()) {
			System.out.println("Not an anagram");
		}

		char[] array1 = word1.toCharArray();
		HashMap<Character, Integer> map1 = new HashMap<>();

		for (char character : array1) {
			map1.put(character, map1.getOrDefault(character, 0) + 1);
		}

		for (int i = 0; i < word2.length(); i++) {
			if (map1.containsKey(word2.charAt(i))) {
				map1.getOrDefault(word2.charAt(i), map1.get(word2.charAt(i))-1);
			}
		}

		boolean isAnagram = false;
		for (Character character : map1.keySet()) {
			if (map1.get(character) != 0) {
				System.out.println("Not an anagram");
				isAnagram = false;
				break;
			}
		}

		if (!isAnagram) {
			System.out.println("Anagram");
		}
	}

}
