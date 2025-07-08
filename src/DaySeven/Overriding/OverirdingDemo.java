package DaySeven.Overriding;

public class OverirdingDemo {

	public static void main(String[] args) {
		RBI rb ;
		//Dynamic binding assigning child object to parent class refrence 
		 rb= new SBI();
		System.out.println(rb.getRateOfInterest());

		rb= new ICICI();
		System.out.println(rb.getRateOfInterest());

		rb= new RBI();
		System.out.println(rb.getRateOfInterest());

	}

}
