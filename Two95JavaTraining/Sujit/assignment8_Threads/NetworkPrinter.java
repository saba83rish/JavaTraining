package assignment8_Threads;

public class NetworkPrinter {

	int currentPage = 0; // page being printed...
	int numOfBlankPagesInTheTray = 500;
	int PAPER_LOAD_TIME = 30;
	int MAX_IDLE_TIME = 60;
	/*
	 * synchronized Keyword allows only one thread to execute the print() method at a time...
	 */
	public synchronized void print(String data) {

		
		this.checkPaperTray();
		int printerIdlePeriod = 0;
		while(numOfBlankPagesInTheTray <1){
			try {
				Thread.currentThread().wait(1000); // java.lang.IllegalMonitorStateException !!!
//				p.wait(1000); // java.lang.IllegalMonitorStateException !!!
				System.out.println("Thread.currentThread() #" + Thread.currentThread().getName() + " is waiting for paper tray to be re-loaded.");
				printerIdlePeriod++;
				if(printerIdlePeriod == PAPER_LOAD_TIME){
					reloadPaperTray();
				} else {
					Thread.currentThread().stop();
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		currentPage++;
		System.out.println("Printing page #" + currentPage + " of " + data + " started.");
		numOfBlankPagesInTheTray--;
		try {
		// Sleep for 1 second (Simulating the printing process)
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		System.out.println("Printing " + data + " completed");
		currentPage = 0;
	}
	
	private void checkPaperTray(){
		numOfBlankPagesInTheTray = 0;
	}
	
	private void reloadPaperTray(){
		numOfBlankPagesInTheTray = 500;
	}
	
	
}
