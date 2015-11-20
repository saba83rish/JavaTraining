package ProgrammingAssinments.Threads;
import java.util.*;

public class WaitClass implements Runnable {
	SetGet setget;
	public WaitClass(SetGet setget){
		this.setget=setget;
	}

	public void run(){
		synchronized(setget){
			try{
			System.out.println("Waiting begins from : "+ new Date());
			setget.wait();
		}
			catch(InterruptedException e){
				e.printStackTrace();
			}
	}
System.out.println("Waiting finished at : "+ new Date());
}
}
