
/*
 * Basic thread implementation example
 * 
 */
public class ThreadExample1 implements Runnable{

	@Override
	public void run() {
		
		
	}

	public static void main(String args[]) {
		
		Thread thread1 = new Thread();
		thread1.start();
		
	    try {
	    	
            thread1.sleep(1000);
            
        } catch (InterruptedException e) {
        	
            e.printStackTrace();
        }
	    
	    thread1.setPriority(1);//adjust thread priority
	    
	    System.out.println("Thread1 priority: "+thread1.getPriority());
	    System.out.println("Thread state: "+thread1.getState());
	}
	
}
