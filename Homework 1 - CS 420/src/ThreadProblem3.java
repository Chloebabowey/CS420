/* Chloe Brown
 * CS 420 - Operating Systems
 * 
 * This program creates 3 threads A,B,C that print out 4000 lines each "A0" - "A4000" "B0" - "B4000" and "C0" - "C4000"
 * Every 10 numbers printed, the current thread will yield to another thread.
 * If running this from Eclipse, right click on this class in the package explorer and click "Run As" and then "Java Application".
 * Otherwise, just click on the batch file in the Prob1 folder.
 */

public class ThreadProblem3 implements Runnable{
	String name;
	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadProblem3("A"));
		Thread t2 = new Thread(new ThreadProblem3("B"));
		Thread t3 = new Thread(new ThreadProblem3("C"));
		t1.start();
        t2.start();
        t3.start();
	}
		
    public ThreadProblem3(String x){
        name = x;
    }
	
	public void run() {
        for(int i=0;i<4001;i++) {     
        	System.out.println(name + i); 
        	if((i%10)==0) {		//every 10 numbers printed, yield to another thread
        	Thread.yield();
        	}
        }
	}
}
