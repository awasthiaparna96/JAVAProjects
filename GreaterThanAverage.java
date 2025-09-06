package com.practice.arrays;

import java.util.Scanner;

public class GreaterThanAverage {

	public static void main(String[] args) {
		// Given an array, count how many elements are greater than the average of the
		// array.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] array = new int[size];

		System.out.println("Enter the elements of the array");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		int sum = 0;
		for (int num : array) {
			sum = sum + num;
		}
		double average = (double)sum / array.length;

		int count = 0;
		for (int num : array) {
			if (num > average) {
				count++;
			}
		}
		System.out.println("Number of elements greater than the average is " + count);

	}

}
