package DayTweleve;

public class Demo {

	public static void main(String[] args) {
		Thread myThread = new ThreadLifeCycleDemo();
		System.out.println("Before Runnable State Thread is Alive");
		myThread.isAlive();
		try {Thread.sleep(450);
	}catch(InterruptedException e) {
		System.err.println(e.getMessage());
	}
System.out.println("After Completion Execution ,it "+myThread.isAlive());
}
}