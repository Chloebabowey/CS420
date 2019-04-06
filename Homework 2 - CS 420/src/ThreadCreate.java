/* Chloe Brown
 * CS 420 - Operating Systems
 * 
 * This program creates 3 threads, starts them and prints the amount of time for the program to run.
 * If running this from Eclipse, right click on this class in the package explorer and click "Run As" and then "Java Application".
 * Otherwise, just click on the batch file in the Prob1 folder.
 */
public class ThreadCreate {
    public static void main(String[] args) {
    Thread Thread1 = new Thread(new Thread1());
    Thread Thread2 = new Thread(new Thread2());
    Thread Thread3 = new Thread(new Thread3());
    Thread1.start();
    Thread2.start();
    Thread3.start();
	long time2 = System.currentTimeMillis();// - time1;		
	System.out.println("main: " + time2 + " ms");
}
}
