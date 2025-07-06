package DayThree.Constructor;
import java.util.Scanner;

public class Constructor {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter CustomerName :");
		String  name = sc.next();
		
		
		System.out.println("Enter CustomerId :");
		int  Id = sc.nextInt();
		
		System.out.println("Enter CustomerCity :");
		String  City = sc.next();
		
		System.out.println(" ");
		
		Customer c1 = new  Customer();
		Customer c2 = new  Customer(name,Id,City);
		Customer c3 = new  Customer(name,Id);
		System.out.println(c2);
		System.out.println(c3);

		

	}

}
