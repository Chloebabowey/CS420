
public class ThreadCreate {
    public static void main(String[] args) {
    Thread Thread1 = new Thread(new Thread1());
    Thread Thread2 = new Thread(new Thread2());
    Thread Thread3 = new Thread(new Thread3());
    
    Thread1.setPriority(Thread.MIN_PRIORITY);
    Thread2.setPriority(Thread.NORM_PRIORITY);
    Thread3.setPriority(Thread.MAX_PRIORITY);
    
    Thread1.start();
    Thread2.start();
    Thread3.start();
    
    try {
//        Thread1.join();
//        Thread2.join();
        Thread3.join();		//since thread3 takes the longest pause, you only have to include it here and the main time will print after
    } catch (InterruptedException e) {
        System.out.println("Main thread Interrupted");
    }
	long time2 = System.currentTimeMillis();		
	System.out.println("main: " + time2 + " ms");
}
}
