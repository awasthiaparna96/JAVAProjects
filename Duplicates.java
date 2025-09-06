package com.practice.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Duplicates {

	public static void main(String[] args) {

		System.out.println("Enter the word");// aaabbcc
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine().replaceAll(" ", "");
		if (word.length() == 0) {
			System.out.println("No word entered");
			return;
		}
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < word.length(); i++) {
			map.put(word.charAt(i), map.getOrDefault(word.charAt(i), 0) + 1);
		}

		ArrayList<Character> arrayList = new ArrayList<>();
		for (Character character : map.keySet()) {
			arrayList.add(character);
		}
		System.out.println(arrayList.toString());
		sc.close();
	}

}
