package com.practice.arrays;

import java.util.Scanner;

public class MoveZeroes {

	public static void main(String[] args) {
		// Given an array of integers, move all 0s to the end while keeping the order of
		// non-zero elements the same.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the integer array");
		int size = sc.nextInt();
		int[] array = new int[size];

		System.out.println("Enter the elements of the array");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

		int right = array.length - 1;
		for (int i = 0; i < right; i++) {
			if (array[i] == 0) {
				array[right] = 0;
				for (int j = i; j < right; j++) {
					array[j] = array[j + 1];
				}
				right--;
			}
		}

		for (int num : array) {
			System.out.println(num);
		}

		int nonZeroIndex = 0;

		// Step 1: Move all non-zero elements to the front
		for (int i = 0; i < size; i++) {
			if (array[i] != 0) {
				array[nonZeroIndex] = array[i];
				nonZeroIndex++;
			}
		}

		// Step 2: Fill the rest with zeroes
		while (nonZeroIndex < size) {
			array[nonZeroIndex] = 0;
			nonZeroIndex++;
		}

		System.out.println("Array after moving zeroes to the end:");
		for (int num : array) {
			System.out.println(num);
		}

		sc.close();
	}

}
