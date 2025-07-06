package DaySix.staticmethod;

public class MyClassDemo {

	public static void main(String[] args) {
		MyClass.display();
		System.out.println();
		MyClass c = new MyClass();
		System.err.println(c);
		MyClass.display();
		System.out.println();
		MyClass x2 = new MyClass();
		System.err.println(x2);
		MyClass.display();

	}

}
