/**
 * 	How to count number of vowels in a string?


 */
package com.two95.java.Assignment6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author bincy
 *
 */
public class CountVowels {

	
	public static void main(String[] args) 
	{
		

		
		System.out.println("Enter the String ");
		char stringCharacter;
		int vowelCount=0;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		
		try 
		{
			
			String inputString = br.readLine().toLowerCase();
			
			for(int i=0;i<inputString.length();i++)
			{
				
				stringCharacter=inputString.charAt(i);
				
				if(stringCharacter=='a'|stringCharacter=='e'|
				   stringCharacter=='i'|stringCharacter=='o'|stringCharacter=='u')
				{
					++vowelCount;
				}
			}
			
			System.out.println(" No of Vowels : "+vowelCount);
		}
		catch(IOException e)
		{
			e.getMessage();
		}
	}

}
