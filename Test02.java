package com.testpro;

interface Hello{
	static void hello2() {};
	default void helloT() {
		System.out.println("hello");
	}
}

public class Test02 {

	public static void main(String[] args) {
		/*
		 * if(true) { //break; }
		 */
}}
