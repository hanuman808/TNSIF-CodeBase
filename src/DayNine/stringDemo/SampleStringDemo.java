package DayNine.stringDemo;

public class SampleStringDemo {
	public static void main(String[] args) {
		char ch []= {'I','N','D','I','A'};
		String s1 = new String(ch);
		System.out.println(s1);
		
		String s2 = new String(s1);
		System.out.println(s2);
		
		String longstr="This is the show "+" How long sentence "+" can b printed";
		System.out.println(longstr);
	}

}
