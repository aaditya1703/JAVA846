package com.lti;

public class Calc {
	
	public static void add(int a, int b) {
		System.out.println("Sum="+(a+b));
	}
	
	public static void diff(int a, int b) {
		System.out.println("Diff="+(a-b));
	}
	public static void product(int a, int b) {
		System.out.println("Product="+(a*b));
	}
	public static void division(int a, int b) {
		System.out.println("Quotient="+(a/b));
	}

	public static void main(String[] args) {
		    System.out.println(add(10,20));
		    System.out.println(sub(10,20));
		    System.out.println(mul(10,20));
		    System.out.println(div(10,20));    

	}

}
