/**
 * 
 */
package com.two95.java.Assignment7;

import java.util.Arrays;
import java.util.List;

/**
 * @author Bincy
 *
 */
public class ArrayOfStringsToList 
{
	
	private static String[] addresses;
	static List stringList;
	public static void main(String[] args)
	{
		
		setAddresses(new String[] {"11936","Dumont Road","Philadelphia","Pensylvania"});
		
		System.out.println("Array: ");
		
		for(int i=0;i<getAddresses().length;i++)
		{
			System.out.println(getAddresses()[i]);
		}
		stringList=Arrays.asList(getAddresses());
		
		System.out.println("List: "+stringList);
		
		
	}

	/**
	 * @return the addresses
	 */
	public static String[] getAddresses() {
		return addresses;
	}

	/**
	 * @param addresses the addresses to set
	 */
	public static void setAddresses(String[] addresses) {
		ArrayOfStringsToList.addresses = addresses;
	}

}
