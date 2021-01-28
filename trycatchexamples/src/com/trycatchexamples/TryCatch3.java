package com.trycatchexamples;

public class TryCatch3 {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		try {
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae.getMessage());
		}

	}

}
