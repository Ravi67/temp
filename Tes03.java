package com.testpro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Tes03 {

	public static void main(String[] args) {

		System.out.println('r'+'a'+'v'+'i');
		
		ArrayList arraylist=new ArrayList();
		arraylist.add("R");

		arraylist.add("R");

		arraylist.add("R");
		System.out.println(arraylist);
		Set <String>set=new HashSet<String>(arraylist);
		System.out.println(set);
		
	}
}

