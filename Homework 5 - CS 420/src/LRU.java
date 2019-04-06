/*
 *Chloe Brown
 *CS 420
 *This class is supposed to implement a least recently used replacement algorithm. I originally had it print the results out 
 *but it was completely wrong so I took that part out.
 */

import java.util.ArrayList;
public class LRU extends ReplacementAlgorithm{

	public LRU(int pageFrameCount) {
		super(pageFrameCount);

	}

	@Override
	public void insert(int pageNumber) {
		ArrayList<Integer> stack = new ArrayList<Integer>();
		int buffer[];
		int pointer=0, fault=0, hit=0;
		Boolean isFull = false;
		int reference[];
		int mem_layout[][];
		PageGenerator gen = new PageGenerator();
		int[] ref = gen.getReferenceString();

		reference = new int[ref.length];
		mem_layout = new int[ref.length][pageFrameCount];
		buffer = new int[pageFrameCount];
		for(int j = 0; j < pageFrameCount; j++)
			buffer[j] = -1;

		for(int i = 0; i < ref.length; i++){
			if(stack.contains(ref[i])) {
				stack.remove(stack.indexOf(ref[i]));
			}
			stack.add(ref[i]);
			int search = -1;
			for(int j = 0; j < pageFrameCount; j++){
				if(buffer[j] == ref[i]) {
					search = j;
					hit++;
					break;
				}
			}
			if(search == -1){
				if(isFull) {
					int min_loc = ref.length;
					for(int j = 0; j < pageFrameCount; j++){
						if(stack.contains(buffer[j])){
							int temp = stack.indexOf(buffer[j]);
							if(temp < min_loc){
								min_loc = temp;
								pointer = j;
							}
						}
					}
				}
				buffer[pointer] = ref[i];
				fault++;
				pointer++;
				if(pointer == pageFrameCount) {
					pointer = 0;
					isFull = true;
				}
			}
			for(int j = 0; j < pageFrameCount; j++)
				mem_layout[i][j] = buffer[j];
		}	
	}

}
