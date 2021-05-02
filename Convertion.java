package com.testpro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Convertion {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int array[]= {1,2,3,4,5,61,2,3,45};
		List<Integer>al= new ArrayList<Integer>(array.length);
		
		for(int i:array) {
			al.add(i);
	}
		System.out.println(al);
		
		Set<Integer> set=new HashSet<Integer>(al);
		System.out.println(set);
		
		
		
}
}
