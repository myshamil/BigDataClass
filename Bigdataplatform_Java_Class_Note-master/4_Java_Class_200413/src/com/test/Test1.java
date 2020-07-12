package com.test;

class Dog{
	public Dog() { // Default Constructor, without variable
	
		age = 1;
		color = "Black";
		System.out.println("Default Constructor Dog");
	}
	
	public Dog(int ag, String clr) { // Default Constructor, variable
		age = ag;
		color = clr;
	} // Constructor Overriding 
	
	String breed;
	int age;
	String color;
	void barking() {}
	void vhungry() {}
	void steeping() {}
	int ihungry() {int a = 1; int b = 2; int c = a+b; return c;}
}

public class Test1 {
	public static void main(String[] args) {
		Dog d= new Dog(); // default constructor
		Dog d2 = new Dog(2, "HOHO"); // constructor overriding
		
//		String s = d.ihungry();  // Return Type Miss Match
		int e = d.ihungry(); // Return Type Match between function and New variable 
	}

}
