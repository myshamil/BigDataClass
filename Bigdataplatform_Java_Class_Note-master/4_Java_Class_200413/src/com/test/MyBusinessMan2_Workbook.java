package com.test;

class Man{
	String name;
	
	public Man(String name) {
		this.name = name;
	}
	public void tellYourname() {
		System.out.println("My name is " + name + '\n');
	}
}

class BusinessMan extends Man{
	String company;
	String position;
	
	public BusinessMan(String name, String company, String position) {
		super(name);
		this.company = company;
		this.position = position;
	}
	public void tellYourInfo() {
		System.out.println("My Company is " + company);
		System.out.println("My position is " + position);
		tellYourname();
	}
}

public class MyBusinessMan2_Workbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusinessMan man = new BusinessMan("KIM", "HwaGoak", "Junior");
		man.tellYourInfo();
	}

}
