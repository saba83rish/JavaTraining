package com.two95.java.exception;

import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=10;
		int j=0;
		int k = 0;
		try {
			System.out.println("BEFORE JUST A METHOD");
			justAMethod(12);
			System.out.println("AFTER JUST A METHOD");
			if (j == 0) {
				throw new Exception("I wont let you divide a number by 0");
			}
			k = i / j;
			
		} catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("k----->"+k);

	}
	
	private static void justAMethod(int number) throws  Exception {
		if (number == 0) {
			throw new Exception("Just a method Exception");
		} else if (number == 10) {
			throw new ArithmeticException("Arithmetic Exception inside Just a method ");
		} else {
			throw new IOException("IO Exception inside Just a method ");
		}
	}
		
}
