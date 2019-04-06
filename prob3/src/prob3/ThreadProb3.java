package prob3;

public class ThreadProb3 implements Runnable{
	String name;
	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadProb3("A"));
		Thread t2 = new Thread(new ThreadProb3("B"));
		Thread t3 = new Thread(new ThreadProb3("C"));
		t1.start();
        t2.start();
        t3.start();
	}
		
    public ThreadProb3(String x){
        name = x;
    }
	
	public void run() {
        for(int i=0;i<4001;i++) {     
        	System.out.println(name + i); 
        if((i%10)==0) {
        	Thread.yield();
        }
        }
	}
}
