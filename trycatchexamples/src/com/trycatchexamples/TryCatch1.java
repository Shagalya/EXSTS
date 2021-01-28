package com.trycatchexamples;

public class TryCatch1 {

	public static void main(String[] args) {
			Object a = null;
			try {
			System.out.println(a);
			}
			catch(NullPointerException e) {
				System.out.println(e.getMessage());
			}
			
		}

	}


