/* Chloe Brown
 * CS 420 - Operating Systems
 * 
 * This program prints out the threads created in ThreadCounter1 with 4000 lines each "A0" - "A4000" "B0" - "B4000" and "C0" - "C4000"
 * If running this from Eclipse, right click on this class in the package explorer and click "Run As" and then "Java Application".
 * Otherwise, just click on the batch file in the Prob1 folder.
 */

public class ThreadProblem1 implements Runnable {

    String name;
    
    public ThreadProblem1(String x){
        name = x;
    }
    
    public void run(){
        	for(int i=0;i<4001;i++) {	//will print at least 4000 of A,B,C
        		System.out.println(name + i); 	//prints name of thread (A,B,C) with number attached
        	}
    }
}