
public class MultithreadExample1 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		Thread thread1 = new Thread("One");
		Thread thread2 = new Thread("Two");
		
		thread1.start();
		thread2.start();
		
		System.out.println(thread1.getName());
		System.out.println(thread2.getName());
	}

}
