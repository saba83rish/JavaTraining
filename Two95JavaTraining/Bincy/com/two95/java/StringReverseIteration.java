/**
 * 
 */
package com.two95.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Bincy
 *
 */
public class StringReverseIteration
{
	public static void main(String[] args)
	{
		String revString= "";
		System.out.println("Enter the String ");
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		
		try 
		{
			
			String inputString = br.readLine();
						
			
			for(int i=inputString.length()-1;i>=0;i--)
			{
				revString=revString+inputString.charAt(i);
				
			}
			
			System.out.println("Reveresed string is : "+revString);
			
		} catch (IOException e) {

			e.getMessage();
			e.printStackTrace();
		}
	}
		

	

	
	
	
}
