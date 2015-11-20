/**
 * 17.	Write a java code which 
 * uses the wait() and notify() methods in threads.
 */
package com.two95.java.Assignment8.WaitNotify;

/**
 * @author Jees
 *
 */
class WaitNotify
{
	synchronized void method1()
	{
		Thread t = Thread.currentThread();

		System.out.println(t.getName()+" is releasing the lock and going to wait");

		try
		{
			wait();        //releases the lock of this object and waits
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}

		System.out.println(t.getName()+" got the object lock back and continue with it's execution");
	}

	synchronized void method2()
	{
		Thread t = Thread.currentThread();

		try
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}

		notify();     //wakes up one thread randomly which is waiting for lock of this object

		System.out.println("A thread which is waiting for lock of this object is notified by "+t.getName());
	}
}

public class WaitNotifyMain
{
	public static void main(String[] args)
	{
		final WaitNotify s = new WaitNotify();

		Thread t1 = new Thread()
		{
			public void run()
			{
				s.method1();   //t1 calling methodOne() of 's' object
			}
		};

		Thread t2 = new Thread()
		{
			@Override
			public void run()
			{
				s.method2();   //t2 calling methodTwo() of 's' object
			}
		};

		t1.start();

		t2.start();
	}
}
