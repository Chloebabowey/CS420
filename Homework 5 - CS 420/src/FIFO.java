/*
 *Chloe Brown
 *CS 420
 *This class is supposed to implement a first in first out replacement algorithm. I originally had it print the results out 
 *but it was completely wrong so I took that part out.
 */

public class FIFO extends ReplacementAlgorithm{

	public FIFO(int pageFrameCount) {
		super(pageFrameCount);
		
	}

	@Override
	public void insert(int pageNumber) {
		int num=0, pageHit=0;
		int pages[];
		int frame[];
		boolean flag = true;
		PageGenerator gen = new PageGenerator();
		int[] ref = gen.getReferenceString();

		frame = new int[pageFrameCount];
		pages = new int[ref.length];

		for(int i=0; i<pageFrameCount; i++)
		{
			frame[i] = -1;
		}

		for(int i=0; i<ref.length; i++)
		{
			flag = true;
			int page = pages[i];
			for(int j=0; j<pageFrameCount; j++)
			{
				if(frame[j] == page)
				{
					flag = false;
					pageHit++;
					break;
				}
			}
			if(num == pageFrameCount)
				num = 0;

			if(flag)
			{
				frame[num] = page;
				num++;
			}
		}
	}
}
