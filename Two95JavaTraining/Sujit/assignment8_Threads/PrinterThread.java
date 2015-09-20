package assignment8_Threads;

public class PrinterThread extends Thread {
	NetworkPrinter p;
	String data;
	int totalPagesPrinted = 0;
	int pagesToPrint = 0;
	
	public PrinterThread(NetworkPrinter p, String data, int pagesToPrint) {
		this.p = p;
		this.data = data;
		if(pagesToPrint > 0){
			this.pagesToPrint = pagesToPrint;
		}
	}
	
	@Override
	public void run() {

//		int badVariable = 1000/0;
//		p.print(String.valueOf(badVariable)); will throw an Exception...
		/*
		 * Exception in thread "Thread-1" java.lang.ArithmeticException: / by zero
			at threads.PrinterThread.run(PrinterThread.java:11)
		 */
		
		synchronized (p) {
			System.out.println("\t\t on = " + data);
			for (int i = 0; i < pagesToPrint; i++) {
				totalPagesPrinted += 1;
			}
			System.out.println("\t totalPagesPrinted = " + totalPagesPrinted + " on " + this.getName());
//			notifyAll();
		}
	}
}
