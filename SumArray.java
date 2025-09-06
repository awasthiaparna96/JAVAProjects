package com.practice.arrays;

import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		// Given an array of integers, return the sum of all its elements.
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] array = new int[size];

		System.out.println("Enter the elements of the array");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

		for (int j = 0; j < size; j++) {
			sum = sum + array[j];
		}
		System.out.println("Sum of elements in an array " + sum);
	}

}
