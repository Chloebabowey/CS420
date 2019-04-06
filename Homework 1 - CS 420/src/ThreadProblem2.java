/* Chloe Brown
 * CS 420 - Operating Systems
 * 
 * This program creates 3 threads A,B,C that print out 4000 lines each "A0" - "A4000" "B0" - "B4000" and "C0" - "C4000"
 * If running this from Eclipse, right click on this class in the package explorer and click "Run As" and then "Java Application".
 * Otherwise, just click on the batch file in the Prob1 folder.
 */


public class ThreadProblem2 implements Runnable {
		String name;
	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadProblem2("A"));
		Thread t2 = new Thread(new ThreadProblem2("B"));
		Thread t3 = new Thread(new ThreadProblem2("C"));
		t1.start();
        t2.start();
        t3.start();
	}
	
    public ThreadProblem2(String x){
        name = x;
    }
	
	public void run() {
        for(int i=0;i<4001;i++)     
        	System.out.println(name + i);  
	}

}
