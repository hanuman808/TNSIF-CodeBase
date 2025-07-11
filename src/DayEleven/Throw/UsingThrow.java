package DayEleven.Throw;
import java.util.Scanner;
public class UsingThrow {
public static int acceptNumber(){
	Scanner sc = new Scanner(System.in);

int n =sc.nextInt();
sc.close();
return n;

}
public static void main(String[] args) {
	int per;
	System.out.println("Enter your percentage ");
	
	per = acceptNumber();
	try {
		if(per<0) {
			throw new negativeExcepton();
		}else if(per>0) {
			throw new  greatervalueException();
			System.out.println("Valid Percentage");
		}catch(NegativeException | greatervalueException e) {
			System.err.println("Error..."+e.getMessage());
		}
	}
}
}

