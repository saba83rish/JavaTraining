package com.two95.java.threads;

public class SynchronizedPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Thread 1
		//Thread 2
		//Thread 3
		//Thread 4
		
		print("name of the doc");
	}
	
	public  static void print(String document) {
		//1. Create the document
		//2. Spell Check
		//3. Store the doc in a DB
		synchronized (document) {
			//4. Print it
			
		}
	}

}
