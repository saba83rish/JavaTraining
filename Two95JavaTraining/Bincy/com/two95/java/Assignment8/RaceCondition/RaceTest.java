/**Write a piece of Java code which generates 
 * Race Condition?
 * 
 */
package com.two95.java.Assignment8.RaceCondition;

/**
 * @author Jees
 *
 */
public class RaceTest
{

	public static void main(String[] args)
	{
		// Create the resource
		RaceCounter p = new RaceCounter();
		// Create Threads
		RaceThreadClass p1 = new RaceThreadClass(p,"a");
		RaceThreadClass p2 = new RaceThreadClass(p,"b");
		RaceThreadClass p3 = new RaceThreadClass(p,"c");
		RaceThreadClass p4 = new RaceThreadClass(p,"d");
		RaceThreadClass p5 = new RaceThreadClass(p,"e");
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
	}
	
}
