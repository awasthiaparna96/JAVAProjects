package com.practice.arrays;

import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		// Return:The indices of the two elements whose sum equals the target.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] array = new int[size];

		System.out.println("Enter the elements of the array");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("Enter the target value");
		int target = sc.nextInt();

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if(array[i]+array[j]==target) {
					System.out.println("The indexes which has sum equal to the target "+i+" & "+j);
				}
			}
		}
	}

}
