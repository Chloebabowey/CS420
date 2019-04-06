/* Chloe Brown
 * CS 420 - Operating Systems
 * 
 * This class controls Thread2 and accesses the methods in the resource class to decrement "value" by one. 
 * 
 * If running this from Eclipse, right click on this class in the package explorer and click "Run As" and then "Java Application".
 * Otherwise, just click on the batch file in the Prob4 folder.
 */

public class Thread2 extends Thread{
	private Resource resource;

	public void run() {
		int x=2;
		int v=0;
		while(x==2) {
			System.out.println("before t2: " + v);
			resource.getSetValue(v--);
			System.out.println("after t2++: " + v);
		}
	}

	public Thread2(Resource r) {
		resource = r;
	}
}