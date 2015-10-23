/**
 * Write an example where we can programmatically
 stop a thread execution.
 */
package com.two95.java.Assignment8.StopThread;

/**
 * @author Jees
 *
 */
public class StopThreadTest
{

	public static void main(String[] args)
	{
		// Create the resource
		StopThreadExample p1= new StopThreadExample();
		
		p1.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		p1.stopThread();
		
	}
		
	
}
    
   