package DaySix.staticmethod;

public class MyClass {
	
		private int section;
		private static int srNo;
		
		static {
			System.out.println("----------Within static block");
			srNo = 100;
			
		}

		public MyClass() {
			System.out.println("Default constructor ");
			srNo++;
			section++;
		}

		@Override
		public String toString() {
			return "MyClass [serial No "+srNo +", section=" + section + "]";
		}
		
static void display() {
	System.out.println(srNo);
	}

}
