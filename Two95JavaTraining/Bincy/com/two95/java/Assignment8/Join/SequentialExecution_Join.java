/*
 * 15.	If there are 4 threads T1 to T4,
 *  how would you programmatically make sure that they
 *  are following a sequence while execution. (hint : join)
 * 
 * */
 
package com.two95.java.Assignment8.Join;

/**
 * @author Jees
 *
 */
public class SequentialExecution_Join {
	 
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "t1");
        Thread t2 = new Thread(new MyRunnable(), "t2");
        Thread t3 = new Thread(new MyRunnable(), "t3");
         
        t1.start();
         
        
        try {
        	//start second thread after waiting for 2 seconds or if it's dead
            t1.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         
        t2.start();
        
        try {
			t2.join(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        t3.start();
         
        //let all threads finish execution before finishing main thread
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         
        System.out.println("All threads are dead, exiting main thread");
    }
 
}
 
class MyRunnable implements Runnable{
 
    @Override
    public void run() {
        System.out.println("Thread started:::"+Thread.currentThread().getName());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread ended:::"+Thread.currentThread().getName());
    }
     
}
