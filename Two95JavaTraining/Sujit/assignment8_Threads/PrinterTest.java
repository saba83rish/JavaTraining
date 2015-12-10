package assignment8_Threads;

public class PrinterTest {
	public static void main(String[] args) {
		// Create the resource
		NetworkPrinter p = new NetworkPrinter();
		// Create Threads
		PrinterThread p1 = new PrinterThread(p, "BOSS's IP Address - Machine", 1);
		PrinterThread p2 = new PrinterThread(p, "Secretary's IP Address - Machine", 5);
		PrinterThread p3 = new PrinterThread(p, "ACCOUNTANT's IP Address - Machine", 50);
		PrinterThread p4 = new PrinterThread(p, "ENGINeer's IP Address - Machine.", 3);

		p1.setPriority(1);
		p2.setPriority(10);
		p3.setPriority(7);
		p4.setPriority(5);

		p1.start();
/*        synchronized(p1){
            try{
                System.out.println("Waiting for Print Job p1 to complete...");
                p1.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            
            System.out.println("Total pages PRINTED is: " + p1.totalPagesPrinted);
        }
*/
/*		p.checkPaperTray();
		int printerIdlePeriod = 0;
		while(p.numOfBlankPagesInTheTray <1){
			try {
//				Thread.currentThread().wait(1000); // java.lang.IllegalMonitorStateException !!!
//				p.wait(1000); // java.lang.IllegalMonitorStateException !!!
				printerIdlePeriod++;
				if(printerIdlePeriod == p.PAPER_LOAD_TIME){
					p.reloadPaperTray();
				} else {
					Thread.currentThread().stop();
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
*/		
		p2.start();
/*        synchronized(p2){
            try{
                System.out.println("Waiting for Print Job p2 to complete...");
                p2.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
 
            System.out.println("Total pages PRINTED is: " + p2.totalPagesPrinted);
        }
*/
		p1.stop();
		p3.start();
/*        synchronized(p3){
            try{
                System.out.println("Waiting for Print Job p3 to complete...");
                p3.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
 
            System.out.println("Total pages PRINTED is: " + p3.totalPagesPrinted);
        }
*/
		p4.start();	
/*        synchronized(p4){
            try{
                System.out.println("Waiting for Print Job p4 to complete...");
                p4.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
 
            System.out.println("Total pages PRINTED is: " + p4.totalPagesPrinted);
        }
*/
	}
}
