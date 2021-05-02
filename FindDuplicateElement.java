package com.testpro;

public class FindDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 11, 22, 33, 44, 22, 33 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {

					count++;

					System.out.println("duplicate element--->" + arr[j]);
				}

			}

		}

	}

}
