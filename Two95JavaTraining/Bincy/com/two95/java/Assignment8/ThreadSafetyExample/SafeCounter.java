/**
 * Thread-Safe Example 
 */
package com.two95.java.Assignment8.ThreadSafetyExample;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Jees
 *
 */

public class SafeCounter {

   

    private int count=1;

    AtomicInteger atomicCount = new AtomicInteger( 0 );




   

    /*

     * This method is thread-safe because of locking and synchornization

     */

    public synchronized int getCount(String data){

    	System.out.println(data +"Ready to increament the count");
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        int value= ++count;

        System.out.println("count increamented");
        System.out.println("Value : "+data +""+count);
        System.out.println("*******************************");
        return value;
    }

   

    /*

     * This method is also thread-safe because count is incremented atomically

     */

    //We are not using this method in the program
    public int getCountAtomically(){

        return atomicCount.incrementAndGet();

    }

}

