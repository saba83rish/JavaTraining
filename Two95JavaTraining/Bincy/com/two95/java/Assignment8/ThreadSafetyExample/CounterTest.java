/**
 * Thread-Safety Example
 */
package com.two95.java.Assignment8.ThreadSafetyExample;

/**
 * @author Jees
 *
 */
public class CounterTest
{

	public static void main(String[] args)
	{
		// Create the resource
		SafeCounter p = new SafeCounter();
		// Create Threads
		CounterThreadClass p1 = new CounterThreadClass(p,"a");
		CounterThreadClass p2 = new CounterThreadClass(p,"b");
		CounterThreadClass p3 = new CounterThreadClass(p,"c");
		CounterThreadClass p4 = new CounterThreadClass(p,"d");
		CounterThreadClass p5 = new CounterThreadClass(p,"e");
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
	}
	
}
