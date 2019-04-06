/*
 * Chloe Brown
 * CS 420 - Operating Systems
 * 
 * This program creates 3 threads A,B,C that print out 4000 lines each "A0" - "A4000" "B0" - "B4000" and "C0" - "C4000"
 * 
 */

package prob2;

public class ThreadProb2 implements Runnable {
		String name;
	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadProb2("A"));
		Thread t2 = new Thread(new ThreadProb2("B"));
		Thread t3 = new Thread(new ThreadProb2("C"));
		t1.start();
        t2.start();
        t3.start();
	}
	
    public ThreadProb2(String x){
        name = x;
    }
	
	public void run() {
        for(int i=0;i<4001;i++)     
        	System.out.println(name + i);  
	}

}
