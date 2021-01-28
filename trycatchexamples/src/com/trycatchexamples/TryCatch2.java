package com.trycatchexamples;

public class TryCatch2 {

	public static void main(String[] args) {
		int a=10;
		try {
			int b=a/0;
			System.out.println("Inside try");
		}
		catch(ArithmeticException ae){
			System.out.println("Inside catch");
			System.out.println(ae.getMessage());
		}

	}

}
