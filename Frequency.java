package com.practice.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		System.out.println("Enter the elements of the array");
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int num : array) {
			if(map.containsKey(num)) {
				map.put(num,map.get(num)+1);
			}else {
				map.putIfAbsent(num, 1);
			}
		}
		
		map.forEach((key, value) -> System.out.println(key + ":" + value));

	}

}
