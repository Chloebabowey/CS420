
public class Thread2 implements Runnable {

	public static void sleepThread2(){
		try {
			long time = System.currentTimeMillis();
			Thread.sleep(500);
			long time1 = System.currentTimeMillis() - time;	
			Thread currentT = Thread.currentThread();
			System.out.println(currentT.getId()  + ": " + time1 + " ms" + "	|	Priority = " + currentT.getPriority());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void run () {
		sleepThread2();
}

}
