package com.practice.arrays;

import java.util.Scanner;

public class MaxInArray {
	public static void main(String[] args) {
		// Given an array of integers, find and return the maximum element.
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
		System.out.println("The largest element of the array is "+largest);

	}
}
