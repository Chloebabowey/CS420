/* Chloe Brown
 * CS 420 - Operating Systems
 * 
 * This class controls Thread1 and accesses the methods in the resource class to increment "value" by one. It also sleeps between
 * getting the value of value and setting the value of value.
 * 
 * If running this from Eclipse, right click on this class in the package explorer and click "Run As" and then "Java Application".
 * Otherwise, just click on the batch file in the Prob3 folder.
 */
import java.util.Random;

public class Thread1 extends Thread{
	private Resource resource;

	public void run() {
		int x=2;
		while(x==2) {
			try {
				int v = resource.getValue();
				System.out.println("before t1: " + v);
				Random random = new Random();
				long rand = random.nextInt(200-10) + 10;		//sleep random time between 10 and 200 ms. ((high - low) + low)
				Thread1.sleep(rand);
				v++;
				resource.setValue(v);
				System.out.println("after t1++: " + v);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public Thread1(Resource r) {
		resource = r;
	}
}
