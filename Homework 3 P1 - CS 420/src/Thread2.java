/* Chloe Brown
 * CS 420 - Operating Systems
 * 
 * This class controls Thread2 and accesses the methods in the resource class to decrement "value" by one. It also sleeps after
 * getting the value of value and setting the value of value.
 * 
 * If running this from Eclipse, right click on this class in the package explorer and click "Run As" and then "Java Application".
 * Otherwise, just click on the batch file in the Prob1 folder.
 */
import java.util.Random;

public class Thread2 extends Thread{
	private Resource resource;

	public void run() {
		int x=2;
		while(x==2) {
			try {
				int v = resource.getValue();
				System.out.println("before t2: " + v);
				v--;
				resource.setValue(v);
				System.out.println("after t2--: " + v);
				Random random = new Random();
				long rand = random.nextInt(200-10) + 10;		//sleep random time between 10 and 200 ms. ((high - low) + low)		
				Thread2.sleep(rand);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}

	public Thread2(Resource r) {
		resource = r;
	}
}