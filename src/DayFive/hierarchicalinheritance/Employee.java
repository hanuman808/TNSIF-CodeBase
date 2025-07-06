package DayFive.hierarchicalinheritance;

public class Employee extends Person{
	private int deptId;
	private float salary;
	private String dept;
	
	
	public Employee() {
		System.out.println("Default value");;
		deptId = 1021;
		salary = 2345000;
		dept ="CS";
	}


	public Employee(int deptId, float salary, String dept) {
		super();
		this.deptId = deptId;
		this.salary = salary;
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "Employee [deptId=" + deptId + ", salary=" + salary + ", dept=" + dept + ", getName()=" + getName()
				+ ", getCity()=" + getCity() + "]";
	}


	
	

	
}
