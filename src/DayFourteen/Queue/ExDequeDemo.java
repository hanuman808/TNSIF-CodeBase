package DayFourteen.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExDequeDemo {

	public static void main(String[] args) {
		Deque<String>deque1 = new ArrayDeque<String>();
		deque1.add("1234");
		deque1.add("aman");
		deque1.add("Kiran");
		deque1.add("KK");
		deque1.add("het");
		
		
		System.out.println(deque1);
		
		
		deque1.pollLast();
		System.out.println(deque1);
		
		deque1.pollFirst();
		System.out.println(deque1);
		
		
		for(String str :deque1) {
			System.out.println("Queue is str :"+str);
		}
		System.out.println(deque1);
		
	}
}
