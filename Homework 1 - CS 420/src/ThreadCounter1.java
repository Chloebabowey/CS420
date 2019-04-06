/* Chloe Brown
 * CS 420 - Operating Systems
 * 
 * This program creates 3 threads A,B,C to be used in class ThreadProblem1
 * If running this from Eclipse, right click on this class in the package explorer and click "Run As" and then "Java Application".
 * Otherwise, just click on the batch file in the Prob1 folder.
 */

public class ThreadCounter1 {
	    public static void main(String[] args) {
	    		//only able to make threads from ThreadExample1 class because it implements runnable
	        Thread t1 = new Thread(new ThreadProblem1("A"));
	        Thread t2 = new Thread(new ThreadProblem1("B"));
	        Thread t3 = new Thread(new ThreadProblem1("C"));
	       
	        t1.start();
	        t2.start();
	        t3.start();
	    }
	}

