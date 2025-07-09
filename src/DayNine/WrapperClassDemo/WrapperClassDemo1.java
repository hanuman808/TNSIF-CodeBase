package DayNine.WrapperClassDemo;

public class WrapperClassDemo1 {
	public static void main(String[] args) {
		//unboxing
		Integer i = new Integer(10);
		System.out.println(i);
		int b = i.intValue();
		System.out.println(b);
		//without using int value
		int c =i;
		System.out.println(c);
		
		//autoboxing
		
		int a = 100;
		Integer i1 = a;
		System.out.println(i1);
	}

}
