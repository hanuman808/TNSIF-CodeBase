//package com.tnsif.hirarchicalInheritance;
//
//public class Student extends Person {
//	private String Class;
//	private float percent;
//	
//	public Student() {
//		System.out.println("default Vaue");
//		Class = "FY";
//		percent = 99.9f;
//		
//	}
//
//	public Student(String Class1, float percent,String name, String city) {
//		super();
//		Class = Class1;
//		this.percent = percent;
//	}
//
//	public String getClass() {
//		return Class;
//	}
//
//	public void setClass(String class1) {
//		Class = class1;
//	}
//
//	public float getPercent() {
//		return percent;
//	}
//
//	public void setPercent(float percent) {
//		this.percent = percent;
//	}
//
//	@Override
//	public String toString() {
//		return "Student [Class=" + Class + ", percent=" + percent + ", getClass()=" + getClass() + ", getPercent()="
//				+ getPercent() + ", getName()=" + getName() + ", getCity()=" + getCity() + "]";
//	}
//
//	
//
//	
//
//	
//	
//
//}
package DayFive.hierarchicalinheritance;

public class Student extends Person {
	private String studentClass;  // ✅ Renamed from 'Class' to avoid conflict
	private float percent;

	// Default constructor
	public Student() {
		System.out.println("Default Value");
		studentClass = "FY";
		percent = 99.9f;
	}

	// Parameterized constructor
	public Student(String studentClass, float percent, String name, String city) {
		super(name, city);  // ✅ Calls parent constructor
		this.studentClass = studentClass;
		this.percent = percent;
	}

	// Getter and Setter
	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public float getPercent() {
		return percent;
	}

	public void setPercent(float percent) {
		this.percent = percent;
	}

	// toString method
	@Override
	public String toString() {
		return "Student [Class=" + studentClass + ", percent=" + percent +
		       ", Name=" + getName() + ", City=" + getCity() + "]";
	}
}

