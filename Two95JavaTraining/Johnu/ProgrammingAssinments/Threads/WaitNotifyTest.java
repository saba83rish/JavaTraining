package ProgrammingAssinments.Threads;

public class WaitNotifyTest {
	public static void main(String[] args){
		SetGet setget = new SetGet("Hi");
		WaitClass wait = new WaitClass(setget);
		Thread WaitClassThread = new Thread(wait,"WaitClassThread");
		WaitClassThread.start();
		
		NotifyClass notify = new NotifyClass(setget);
		Thread NotifyClassThread = new Thread(notify,"NotifyClassThread");
		NotifyClassThread.start();
	}
}
