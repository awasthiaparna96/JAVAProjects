package com.practice.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingElementString {

	public static void main(String[] args) {
		// First Non-Repeating Character in a String
		System.out.println("Enter the String word");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();

		char[] array = word.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();

		for (char character : array) {
			map.put(character, map.getOrDefault(character, 0) + 1);
		}
		
		boolean found = false;
		for(char character : array) {
			if(map.get(character)==1) {
				System.out.println("first character with only one count "+character);
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("-1");
		}
		
		sc.close();

	}

}
