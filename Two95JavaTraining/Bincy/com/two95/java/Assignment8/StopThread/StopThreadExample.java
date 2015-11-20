/**
 * Stop-Thread
 */
package com.two95.java.Assignment8.StopThread;

/**
 * @author Jees
 *
 */
 class StopThreadExample extends Thread {
	private volatile Thread stopIndicator;

	public void start() {
		stopIndicator = new Thread(this);
		stopIndicator.start();
	}

	public void stopThread() {
		
		stopIndicator = null;
	}

	@Override
	public void run() {
		Thread thisThread = Thread.currentThread();
		while(thisThread == stopIndicator) {
			try {
				System.out.println("thread SLEEPING");
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
			}
			System.out.println("INTERRUPTED");
		}
	}
}
