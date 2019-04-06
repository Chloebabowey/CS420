/* Chloe Brown
 * CS 420 - Operating Systems
 * 
 * This class controls Thread1 and accesses the methods in the resource class to increment "value" by one.
 * 
 * If running this from Eclipse, right click on this class in the package explorer and click "Run As" and then "Java Application".
 * Otherwise, just click on the batch file in the Prob4 folder.
 */

public class Thread1 extends Thread{
	private Resource resource;
	public void run() {
		int x=2;
		int v = 0;
		while(x==2) {
			System.out.println("before t1: " + v);
			resource.getSetValue(v++);
			System.out.println("after t1++: " + v);
		}
	}
	
	public Thread1(Resource r) {
		resource = r;
	}
}
