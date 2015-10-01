/**
 * How to check if a string is a palindrome?
 */
package com.two95.java.Assignment6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Bincy
 *
 */
public class Palindrome {

	
	public static String reverse(String input)
	{
		String revString="";
		for(int i=input.length()-1;i>=0;i--)
		{
			revString=revString+input.charAt(i);
			
		}
		
		return revString;
		
	}
	
	public static void main(String[] args)
	{
		
		
		System.out.println("Enter the String ");
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

			
		try 
		{
			String inputString = br.readLine();
			String reverseString=reverse(inputString);
			
			if(inputString.equals(reverseString))
					System.out.println("Palindrome");
			else
				System.out.println("Not Palindrome");
			
		
			
		} catch (IOException e)
		{
			
			e.printStackTrace();
		}
	}
}
