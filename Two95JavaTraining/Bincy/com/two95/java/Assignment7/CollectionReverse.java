/**
 * 
 */
package com.two95.java.Assignment7;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Jees
 *
 */
public class CollectionReverse
{

	public static void main(String[] args)
	{
		
		ArrayList<String> array= new ArrayList<String>();
		array.add("Bincy");
		array.add("Varghese");
		
		System.out.println(" Before Reversing : "+array);
		
		Collections.reverse(array);
		
		System.out.println(" Revered List : "+array);
		
		
	}
}
