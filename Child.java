package com.testpro;

public class Child extends Parent{

	int v1=10;
	
	
	
	 private void m1()
	{
		System.out.println("child m1");
	}
}

class Parent
{
	int v1=5;
	 private void m1()
	{
		System.out.println("m2");
	}
	 public static void main(String[] args) {
			// TODO Auto-generated method stub

			Parent p=new Child();
			p.m1();
			//System.out.println(p.v1);
			
		}

}
