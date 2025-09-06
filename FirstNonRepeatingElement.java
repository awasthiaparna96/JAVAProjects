package com.practice.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int[] array = new int[size];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int num : array) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		boolean found = false;
		for (int num : array) {
			if (map.get(num) == 1) {
				System.out.println("The first element occurring only once is " + num);
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("-1");
		}

		sc.close();

	}

}
