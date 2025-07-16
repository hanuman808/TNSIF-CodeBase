package DayFourteen.Set;

import java.util.HashSet;
import java.util.Set;

public class StudentSetDemo {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		set.add(new Student(101,"Hanuman",45.64));
		set.add(new Student(1012,"Heti",67.64));
		set.add(new Student(101,"Zeel",49.64));
		set.add(new Student(1012,"Heti",45.64));
		set.add(new Student(1013,"Ram",85.64));
		set.add(new Student(102,"Hanuman",95.64));

		System.out.println(set);
	}

}
