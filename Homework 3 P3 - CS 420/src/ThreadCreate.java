/* Chloe Brown
 * CS 420 - Operating Systems
 * 
 * This class contains the main method and creates/starts the 2 threads used in this program.
 * 
 * If running this from Eclipse, right click on this class in the package explorer and click "Run As" and then "Java Application".
 * Otherwise, just click on the batch file in the Prob3 folder.
 */
public class ThreadCreate {
	public static void main (String[]args) {
		Resource r  = new Resource();
		Thread Thread1 = new Thread(new Thread1(r));
		Thread Thread2 = new Thread(new Thread2(r));

		Thread1.start();
		Thread2.start(); 	
	}
	
}
