
public class CustomRunnable1 implements Runnable{
	
	private Thread thread;
	private String threadName;
	
	public CustomRunnable1(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		System.out.println("Thread name running: "+thread.getName());
		
		for(int i = 0 ; i < 5; i++) {
			System.out.println(thread.getName()+" : "+(i+1));
			try {
				thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void start() {
		System.out.println("Thread Starting");
		if(thread == null) {
			thread = new Thread(this,threadName);
			thread.start();
		}
	}

}
