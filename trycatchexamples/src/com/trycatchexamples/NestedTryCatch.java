package com.trycatchexamples;

public class NestedTryCatch {
	public static void main(String[] args) {
		int a=10;
		int arr[]= {2,3,4};
		try {
			arr[3]= 5;
			int b=a/0;
			}
		catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae.getMessage());
		}
		finally {
			System.out.println("Inside Finally");
		}
		}
	}


