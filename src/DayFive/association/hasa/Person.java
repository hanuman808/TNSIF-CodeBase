package DayFive.association.hasa;

public class Person {
	private String name;
	private Address address;
	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	
	
	void displayInfo() {
		System.out.println("Entr your name "+ name);
		System.out.println("Name: " + name);
		System.out.println("Street: " + address.getStreet());
		System.out.println("City: " + address.getCity());
		System.out.println("State: " + address.getState());
		System.out.println("Postal Code: " + address.getPostalCode());
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	

}
