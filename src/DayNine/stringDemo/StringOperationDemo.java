package DayNine.stringDemo;

public class StringOperationDemo {

	public static void main(String[] args) {
		String s1=new String(" Indian ");
		System.out.println(s1);
		
		String s2 = s1.toUpperCase();
		System.out.println(s2); 
		System.out.println(s1.length());
		int a = s2.length();
		String s3 = s1.substring(1,7);
		System.out.println(s3);
		
		System.out.println(s1.trim());
		System.out.println(s1.stripTrailing());
		System.out.println(s1.isEmpty());
		
		
		s2 = new String(s1);
		//equals --> object reference
		//== --> data comparing
		System.out.println("Case 1 "+s1.equals(s2));
		System.out.println("Case 2 "+ s1==s2);

		
		String A1 = "TNSIF";
		String A2 = "TNSIF";
		
		String A3 = new String ("TNSIF");
		String A4 = new String ("TNSIF");
		
		
		System.out.println("Case 1 "+A1==A3);
		System.out.println("Case 2 "+A1==A2);
		System.out.println("Case 3 "+A1.equals(A2));
		System.out.println("Case 4 "+A1.equals(A3));
		System.out.println("Case 5 "+A3==A4);
		System.out.println("Case 6 "+A3.equals(A4));



		System.out.println(A1.hashCode());
		System.out.println(A2.hashCode());
		
		System.out.println(A1.compareTo(A2));




		
	}

}
