/**
 * logic to print duplicate characters in a string
 */
package com.two95.java.Assignment6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Bincy
 *
 */
public class StringDuplicateChar
{

	public static void main(String[] args)
	{

		String duplString= "";

		System.out.println("Enter the String ");

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try
		{
			//Accept user input
			String orgString = br.readLine().toLowerCase();

			//compare string character 
			for(int i=0;i<orgString.length();i++)
			{

				for(int j=i+1;j<orgString.length();j++)
				{

					if(orgString.charAt(i)==orgString.charAt(j))
					{
						//convert char to string using string.valuOf ()
						if(!duplString.contains(String.valueOf(orgString.charAt(i))))
						{

							duplString=duplString+(orgString.charAt(i))+" ";
							break;
						}

					}
				}	


			}

			System.out.println("***************************************");
			if(duplString.length()==0)
			{
				System.out.println(" No duplicate characters");
			}
			else
			{


				System.out.println("duplicate characters are : "+duplString);
			}
		} catch (IOException e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch(StringIndexOutOfBoundsException s)
		{
			System.out.println(s.getMessage());
		}


	}

}
