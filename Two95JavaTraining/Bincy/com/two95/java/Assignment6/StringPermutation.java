/**
 * 
 */
package com.two95.java.Assignment6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author Jees
 *
 */
public class StringPermutation
{


	public static void main(String[] args)
	{

		System.out.println("Enter the string");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);


		try 
		{
			String inputString=br.readLine();

			System.out.println("All the possible combinations are : ");

			ArrayList<String> resultArray=permutation(inputString);

			for(int i = 0; i<resultArray.size();i++)
			{
				System.out.println(i+1+") "+resultArray.get(i));
			}

		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

	/**
	 * List permutation of a string
	 * 
	 * @param s the input string
	 * @return  the list of permutation
	 */
	public static ArrayList<String> permutation(String s)
	{
		// The result
		ArrayList<String> res = new ArrayList<String>();
		// If input string's length is 1, return {s}
		if (s.length() == 1)
		{

			res.add(s);

		}
		else if (s.length() > 1) 
		{
			int lastIndex = s.length() - 1;
			
			// Find out the last character
			String last = s.substring(lastIndex);
			
			// Rest of the string
			String rest = s.substring(0, lastIndex);
			
			// Perform permutation on the rest string and
			// merge with the last character
 
			ArrayList<String> helperarray=new ArrayList<String>();
			helperarray=permutation(rest);
			
		

			res = merge(helperarray, last);

		}
		return res;
	}


	/**
	 * @param list a result of permutation, e.g. {"ab", "ba"}
	 * @param c    the last character
	 * @return     a merged new list, e.g. {"cab", "acb" ... }
	 */
	public static ArrayList<String> merge(ArrayList<String> list,String c)
	{
		ArrayList<String> res = new ArrayList<String>();
		
		
		for (int j=0;j<list.size();j++) 
		{
			// For each string, insert the last character to all possible positions
			// and add them to the new list
			for (int i = 0; i <= list.get(j).length(); ++i)
			{
				String ps = new StringBuffer(list.get(j)).insert(i, c).toString();
				res.add(ps);
			}
		}
		return res;
	}
	
}
		


