package com.testpro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int min, max = 0;
		int[] array = { 2, 4, 01, 5, 67, 98, 100 };
		List<Integer> list = new ArrayList<Integer>(array.length);
		for (int i : array) {
			list.add(i);
		}

		System.out.println(list);

		min = Collections.min(list);
		max = Collections.max(list);
		System.out.println("minimum value in the arraylist--> " + min);
		System.out.println("maximum value in the arraylist--> " + max);

		
	}

}
