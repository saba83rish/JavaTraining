package ProgrammingAssinments.Threads;
import java.util.*;

public class NotifyClass implements Runnable {
	SetGet setget;
	public NotifyClass(SetGet setget){
		this.setget=setget;
	}
	public void run(){
			try{
			System.out.println("Notifier starts to sleep at : "+ new Date());
			Thread.sleep(5000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			synchronized (setget){
				
				setget.setString("Notifier slept for 5 seconds, going to notify setget at : "+new Date());
				System.out.println("Notifier is notifying waiting thread to wake up at " + new Date());
				setget.notify();
			}
		}
}