/**
 * Thread-Safety Example
 */
package com.two95.java.Assignment8.ThreadSafetyExample;

/**
 * @author Jees
 *
 */
public class CounterThreadClass extends Thread {
SafeCounter thrdcount;
String data;

public CounterThreadClass(SafeCounter thrdcount,String data)
{
	this.thrdcount=thrdcount;
	this.data=data;
}
public void run() {
thrdcount.getCount(data);
}
}