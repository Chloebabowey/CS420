
public class Thread3 implements Runnable {
	
	public static void sleepThread3(){
		try {
			long time = System.currentTimeMillis();
			Thread.sleep(1300);
			long time1 = System.currentTimeMillis() - time;	
			Thread currentT = Thread.currentThread();
			System.out.println(currentT.getId()  + ": " + time1 + " ms" + "	|	Priority = " + currentT.getPriority());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void run () {
		sleepThread3();
}
}
