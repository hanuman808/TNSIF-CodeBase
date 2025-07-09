package DayTen.singledimensiondemo;

public class ArrayObjectDemo {

	public static void main(String[] args) {
//		Student s = new Student(0,null);
		
		Student []arr;
		arr= new Student[5];
		
		arr[0]=new Student(101,"Geet");
		arr[1]=new Student(102,"Vinod");
		arr[2]=new Student(103,"DArshan");
		arr[3]=new Student(104,"Adi");
		arr[4]=new Student(105,"Geeta");

		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].getRollNo()+"  "+arr[i].getName());
		}
	}

}
