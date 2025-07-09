package DayTen;

public class ArrayDemoOne {
	

	    public static void main(String[] args) {

	        int n = 10;
	        int[] a = new int[n]; // Declaration + instantiation

	        // Assign values in array a
	        for (int i = 0; i < a.length; i++) {
	            a[i] = 5 * i;
	        }

	        // Display array a
	        System.out.print("Array a: ");
	        ArrayClassDemo.printArray(a);

	        // Initialize and display array b
	        int[] b = {10, 20, 30, 40, 50};
	        System.out.print("Array b: ");
	        ArrayClassDemo.printArray(b);

	        // Call variable argument method
	        System.out.println("Sum of array b elements: " + ArrayClassDemo.getSum(b));
	        System.out.println("Sum of inline values: " + ArrayClassDemo.getSum(10, 20, 30, 40, 60, 80));

	        // Modify a single element
	        b[2] = 999;
	        System.out.print("Modified array b: ");
	        ArrayClassDemo.printArray(b);

	        // Display odd and even counts
	        System.out.println("Odd count: " + ArrayClassDemo.getOddCount(b)
	                + "\tEven count: " + ArrayClassDemo.getEvenCount(b));
	    }
	}




