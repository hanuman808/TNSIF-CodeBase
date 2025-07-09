package DayEleven.finallyblock;

public class NestedTryCatch {
public static void check() {
	String str  = "TNS";
	int slength = str.length();
	System.out.println(slength);
	
	String anotherString = null;
	int y=6;
	try {
	try {
		System.out.println(str.charAt(y));
		
	}catch(StringIndexOutOfBoundsException e) {
		System.err.println(e.getMessage());
	}
	System.out.println("String length :"+anotherString);
	}
	catch(NullPointerException e) {
		System.err.println(e.getMessage());
	}
}
}
