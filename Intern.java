package com.testpro;

public class Intern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="hello";
		String str2=new String("hello");
		str2.intern();

		System.out.println(str==str2);
	}

}
