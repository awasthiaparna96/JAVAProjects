package com.practice.arrays;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		// Find the Second Largest Element in an Array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] array = new int[size];

		System.out.println("Enter the elements of the array");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		int largest=array[0];
		for (int j = 1; j < array.length; j++) {
			if(array[j]>largest) {
				largest=array[j];
			}
		}
		int secondLargest = array[0];
		for (int j = 1; j < array.length; j++) {
			if(array[j]>secondLargest&&array[j]<largest) {
				secondLargest=array[j];
			}
		}
		System.out.println("Second Largest element in the array "+secondLargest);

	}

}
