 package DaySix.staticmethod;

public class Employee { 
	//Instance variable
	private String name;
	private int id;
	static String CompanyName="TNSIF";
	
	
	public Employee(String name, int id) {
		
		this.name = name;
		this.id = id;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", company="+ CompanyName+"]";
	}
	

}
