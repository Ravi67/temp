package com.testpro;

import java.util.ArrayList;
import java.util.Collections;

public class MinMaxUsingCollections {

	public int minvalue(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public int maxvalue(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public void minmaxcollections() {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(20);
		arraylist.add(34);
		arraylist.add(66);
		arraylist.add(36);
		arraylist.add(98);
		System.out.println("arraylist " + arraylist);
		int min = Collections.min(arraylist);
		int max = Collections.max(arraylist);

		System.out.println("arraylist min " + min);
		System.out.println("arraylist max " + max);
		System.out.println("sum of min max value " + (min + max));

	}

	public static void main(String[] args) {
		int[] arr = { 20, 44, 67, 89, 45, 83 };
		MinMaxUsingCollections object = new MinMaxUsingCollections();
		System.out.println("max value in array " + object.maxvalue(arr));
		System.out.println("min value in array " + object.minvalue(arr));

		object.minmaxcollections();

	}

}
