package com.tnsif.DayTweleve.multithreading;

public class childDemo {

	public static void main(String[] args) {
		ChildThread c = new ChildThread(10, "Hello");
		c.start();
		System.out.println("End of the program ");
	}
}
