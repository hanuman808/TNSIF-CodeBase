package DayThree.Encapsulation;

public class OopConcept {
	private int serialNum;
	private String name;
	private int age;
	
	public OopConcept(int serialNum, String name, int age) {
		
		this.serialNum = serialNum;
		this.name = name;
		this.age = age;
	}
	public OopConcept() {
		
	}
	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "OopConcept [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
	}
	
	
	

}
