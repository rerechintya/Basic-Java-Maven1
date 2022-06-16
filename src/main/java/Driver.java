import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.increment(3);
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.decrement(10);
		
		System.out.println("Current count:" + counter.getCount());

		counter.multiplyBy(4);
		
		System.out.println("Current count:" + counter.getCount());
		
	}

}
