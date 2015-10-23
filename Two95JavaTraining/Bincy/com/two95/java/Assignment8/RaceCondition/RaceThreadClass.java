//**Race Condition

package com.two95.java.Assignment8.RaceCondition;

/**
 * @author Jees
 *
 */
public class RaceThreadClass extends Thread {
RaceCounter thrdcount;
String data;

public RaceThreadClass(RaceCounter thrdcount,String data)
{
	this.thrdcount=thrdcount;
	this.data=data;
}
public void run() {
	thrdcount.getCount(data);
}
}