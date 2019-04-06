/* Chloe Brown
 * CS 420 - Operating Systems
 * 
 * This class was given in the assignment and is accessed by two threads that alter "value"
 * 
 * If running this from Eclipse, right click on this class in the package explorer and click "Run As" and then "Java Application".
 * Otherwise, just click on the batch file in the Prob4 folder.
 */
 class Resource {

	private volatile int value;
	public int getValue(){
		return value;
	}

	// Value should only be changed by 1 
	public void setValue(int v){
		if(Math.abs(value-v) != 1)
		{
			System.out.println("Mismatch: "+value+" "+v);
		}
		value = v;
	}
	
	public synchronized void getSetValue(int v) {
		setValue(value);
		value = v;
	}
}
