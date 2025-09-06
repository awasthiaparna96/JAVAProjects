package com.practice.setAndList;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = getSizeArray(sc);
		int[] array = new int[size];
		System.out.println("Enter the elements of the array");
		defineElements(array, sc);
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		removeDuplicates(array, set);
		for(int num : set) {
			System.out.println(num);
		}

	}

	public static int getSizeArray(Scanner scanner) {
		return scanner.nextInt();
	}

	public static int[] defineElements(int[] array, Scanner scanner) {
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		return array;
	}

	public static LinkedHashSet<Integer> removeDuplicates(int[] array, LinkedHashSet<Integer> set) {
		for (int num : array) {
			if (!set.contains(num)) {
				set.add(num);
			}
		}
		return set;
	}

}
