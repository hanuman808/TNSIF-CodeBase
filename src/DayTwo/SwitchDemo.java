package DayTwo;
import java.util.*;
public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input : ");
		
		int user =sc.nextInt();
		switch(user) {
		case 1:System.out.println("Current recharge details ");
		break;
		case 2:System.out.println("Current recharge Expiry ");
		break;
		case 3:System.out.println("New Offers ");
		break;
		case 4:System.out.println("Talk to our Customer Support Person");
		break;
		default:
			System.out.println("Invalid Input");
		}
	}

}
