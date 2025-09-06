package com.practice.arrays;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// Given an array of integers, reverse the array in-place (i.e., without using
		// extra space or a new array).
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] array = new int[size];

		System.out.println("Enter the elements of the array");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		int num = 0;
		for (int j = 0; j < array.length; j++) {
			num = array[j];
			array[j] = array[array.length - j - 1];
			array[array.length - j - 1] = num;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		
		//Approach two
		int left = 0;
		int right = array.length - 1;
		while (left < right) {
			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;

			left++;
			right--;
		}

		System.out.println("Reversed array:");
		for (int value : array) {
			System.out.println(value);
		}

		sc.close();
	}
}
