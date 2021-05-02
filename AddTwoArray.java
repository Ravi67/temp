package com.testpro;

import java.util.Arrays;

public class AddTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array1[] = { 1, 2, 3, 4 };
		int array2[] = { 4, 3, 2, 1 };

		int length = array1.length + array2.length;
		System.out.println(length);
		int position = 0;
		int[] mergearray = new int[length];

		for (int i : array1) {
			mergearray[position] = i;
			position++;
		}
		System.out.println("pos" + position);

		for (int i : array2) {
			mergearray[position] = i;
			position++;
		}

		System.out.println(Arrays.toString(mergearray));
		System.out.println("pos" + position);

	}

}
