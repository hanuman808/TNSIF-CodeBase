package DayTen;
import java.util.Arrays;
public class ArrayClassDemo {


	
		//print int array 
		static void printArray(int[] arr)
		{
			for(int i=0; i<arr.length;i++)
			{
				System.out.print(arr[i] + "\t");
				System.out.println();
			}
		}
		
		//varible argument function
		
		public static int getSum(int... n)
		{
			int sum=0;
			for(int no : n)
				sum +=no;
			return sum;
		}
		
		//count no. of odd elements
		
		public static int getOddCount(int b[])
		{
			int count=0;
			for(int i=0; i<b.length; i++)
			{
				if(b[i] % 2 !=0)
					count++;
			}
			return count;
		}
		
		//count no. even elemnts 
		public static int getEvenCount(int b[])
		{
			return b.length-getOddCount(b);
			
		}
	}

//	public class ArrayDemoOne {

		public static void main(String[] args) {
			
			int n=10;
			int a[]; //declaration 
			a=new int[n]; // instantiation
			
			//displaying the array 
			ArrayClassDemo.printArray(a);
			
			//assigning va;ues in array a
			for(int i=0; i<a.length; i++)
			{
				a[i]=5*i;
				ArrayClassDemo.printArray(a);
				
			}
			
			int b[] = {10,20,30,40,50}; // initialization at the time of declaration 
			ArrayClassDemo.printArray(b);
			
			//calling of varibles argument function 
			System.out.println("Sum of array elements is :"+ ArrayClassDemo.getSum(b));
			System.out.println("Sum of array elements is : "+ ArrayClassDemo.getSum(10,20,30,40,60,80));
			
			b[2]= 999; //assigning single elements
			
			ArrayClassDemo.printArray(b);
			
			//displaying total odd and even no 
			System.out.println("Odd number : "+ ArrayClassDemo.getOddCount(b)
			+"\t Even no "+ ArrayClassDemo.getEvenCount(b));
		
			System.out.println();
			
			

		}

	}
	


