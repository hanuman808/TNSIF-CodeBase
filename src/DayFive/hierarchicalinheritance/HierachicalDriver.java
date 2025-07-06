
package DayFive.hierarchicalinheritance;

public class HierachicalDriver {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p);

		Person p1;

		p1 = new Person("Hanuman", "Pune");
		System.out.println(p1);

		p1 = new Student("SY", 69.98f, "Hanuman", "Pune");
		System.out.println(p1);

//		p1 = new Employee("Hanuman", "Pune", 1002, 450000, "AI", "Manager");
//		System.out.println(p1);
	}
}

