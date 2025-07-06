package DayFive.association.hasa;


public class Executor {

	public static void main(String[] args) {
	Address address = new Address("405 Laxmi nagar ","pune","maharastra","1234");
	Person p = new Person ("Hanuman",address);
	p.displayInfo();
	System.out.println(p);

	}



}
