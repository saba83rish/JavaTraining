/* Thread-Race Example 
 */
package com.two95.java.Assignment8.RaceCondition;

/**
 * @author Jees
 *
 */

public class RaceCounter {

   

    private int count=0;
   

    /*

     * This method is not thread-safe 
     */

    public int getCount(String data){

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

  

}

