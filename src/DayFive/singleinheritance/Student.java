package DayFive.singleinheritance;

public class Student extends CitiZens {
//	private String StudentName;
//	private String Address;
//	private Long PhoneNo;
	private int rollNo;
	private String collegeName;
   
	public Student() {
		super();
	}

	public Student(String name, String adharNo, String address, long phone,int rollNo, String collegeName) {
		super( name,  adharNo,  address,  phone);
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", getName()=" + getName()
				+ ", getAdharNo()=" + getAdharNo() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone()
				+ "]";
	}
	


	
	
}
