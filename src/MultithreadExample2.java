
public class MultithreadExample2 {

	public static void main(String[] args) {
		
		CustomRunnable1 thread1 = new CustomRunnable1("One");
		thread1.start();
		CustomRunnable1 thread2 = new CustomRunnable1("Two");
		
		
		thread2.start();
	}

}
