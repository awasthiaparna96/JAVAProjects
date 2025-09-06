package com.practice.setAndList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class IntersectionArrays {

	public static void main(String[] args) {
		
		System.out.println("Enter the size of array 1 and array 2");
		Scanner sc = new Scanner(System.in);
		int size1 = sc.nextInt();
		int size2 = sc.nextInt();
		ArrayList<Integer> array1 = new ArrayList<>();
		System.out.println("Enter the elements of Array 1");
		for(int i=0;i<size1;i++) {
			array1.add(i, sc.nextInt());
		}
		ArrayList<Integer> array2 = new ArrayList<>();
		System.out.println("Enter the elements of Array 2");
		for(int i=0;i<size2;i++) {
			array2.add(i, sc.nextInt());
		}
		
		HashSet<Integer> set1 = new HashSet<>();
		for(int num:array1) {
			if(!set1.contains(num)) {
				set1.add(num);
			}
		}
		
		HashSet<Integer> set2 = new HashSet<>();
		for(int num:array2) {
			if(!set2.contains(num)) {
				set2.add(num);
			}
		}
		
		System.out.println("The common elements are");
		int count = 0;
		for(int num:set2) {
			if(set1.contains(num)) {
				System.out.println(num);
				count ++;
			}
		}
		if(count==0) {
			System.out.println("No common element");
		}
		
		sc.close();
	}

}
