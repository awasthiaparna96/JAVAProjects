package com.practice.arrays;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSumHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println("Enter the target value");
		int target = sc.nextInt();

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int j = 0; j < array.length; j++) {
			int complement = target - array[j];

			if (map.containsKey(complement)) {
				System.out.println("The indexes are " + j + " & " + map.get(complement));
				sc.close();
				return;
			}

			map.put(array[j], j);
		}

		System.out.println("No two elements add up to the target.");
		sc.close();
	}

}
