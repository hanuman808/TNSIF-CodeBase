package DayTweleve;

public class ThreadLifeCycleDemo extends Thread {
	public void run() { 
		System.out.println(" in side run () thread  is alive or not "+this.isAlive());
		int num=0;
		while(num<4) {
			num++;
			System.out.println("NUm "+num);
		}try {
			sleep(1000);
			System.out.println("in npt runnabe state ,thread is alive"+this.isAlive());
			
		}catch(InterruptedException e) {
			System.err.println("Thread is interrupted "+ e.getMessage());
		}
		
	}

	
}
