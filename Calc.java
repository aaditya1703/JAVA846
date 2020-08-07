package com.lti;

public class Calc {
	
	public static int add(int a, int b) {
		System.out.println("Sum="+(a+b));
	}
	
	public static int diff(int a, int b) {
		System.out.println("Diff="+(a-b));
	}
	public static int product(int a, int b) {
		System.out.println("Product="+(a*b));
	}
	public static int division(int a, int b) {
		System.out.println("Quotient="+(a/b));
	}

	public static void main(String[] args) {
		    System.out.println(add(10,20));
		    System.out.println(diff(10,20));
		    System.out.println(product(10,20));
		    System.out.println(division(10,20));    

	}

}
