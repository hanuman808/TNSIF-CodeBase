package DayThree.Scanner;
import java.util.Scanner;

import com.tnsif.daythree.scanner.TaxCalculation;
public class PersonDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		System.out.println("Enter your name  :");
		name = sc.nextLine();
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		System.out.println("Enter your Gender :");
		String gender = sc.next();
		System.out.println("Enter your Mobile number :");
		long mobileNumber = sc.nextLong();
		System.out.println("Enter your income : ");
		int income = sc.nextInt();
		
		Person s = new Person();
		s.setName(name);
		s.setAge(age);
		s.setGender(gender);
		s.setIncome(income);
		s.setMobileNumber(mobileNumber);
		
		System.out.println(s.getName());
		System.out.println(s.getGender());
		
	   System.out.println(s);
	   
	   TaxCalculation cal = new TaxCalculation();
	   cal.caculateTax(s);
	   System.out.println(s);

	}

}
