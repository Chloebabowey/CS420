/* Chloe Brown
 * CS 420 - Operating Systems
 * 
 * This program puts the second thread, created in class ThreadCreate, to sleep for 500ms.
 * If running this from Eclipse, right click on this class in the package explorer and click "Run As" and then "Java Application".
 * Otherwise, just click on the batch file in the Prob1 folder.
 */
public class Thread2 implements Runnable {

	public static void sleepThread2(){
		try {
			long time = System.currentTimeMillis();
			Thread.sleep(500);
			long time1 = System.currentTimeMillis() - time;	
			Thread currentT = Thread.currentThread();
			System.out.println(currentT.getId()  + ": " + time1 + " ms");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void run () {
		sleepThread2();
}

}
