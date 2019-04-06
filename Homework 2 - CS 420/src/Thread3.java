/* Chloe Brown
 * CS 420 - Operating Systems
 * 
 * This program puts the third thread, created in class ThreadCreate, to sleep for 1300ms.
 * If running this from Eclipse, right click on this class in the package explorer and click "Run As" and then "Java Application".
 * Otherwise, just click on the batch file in the Prob1 folder.
 */
public class Thread3 implements Runnable {
	
	public static void sleepThread3(){
		try {
			long time = System.currentTimeMillis();
			Thread.sleep(1300);
			long time1 = System.currentTimeMillis() - time;	
			Thread currentT = Thread.currentThread();
			System.out.println(currentT.getId()  + ": " + time1 + " ms");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void run () {
		sleepThread3();
}
}
