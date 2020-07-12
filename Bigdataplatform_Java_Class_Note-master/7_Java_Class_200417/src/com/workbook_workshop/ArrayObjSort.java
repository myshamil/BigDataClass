package com.workbook_workshop;

import java.util.Arrays;

class Person implements Comparable{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
		
		if(this.name.length() > p.name.length())
			return 1;
		
		else if(this.name.length() < p.name.length())
			return -1;
		
		else
			return 0;		
	}
	
	@Override
	public String toString() {
		return name + ": " + age;
	}
}

public class ArrayObjSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] ar = new Person[3];
		ar[0] = new Person("Lee K", 29);
		ar[1] = new Person("GOO KKK", 15);
		ar[2] = new Person("Soo KK", 37);
		
		Arrays.sort(ar);
		for(Person p : ar)
			System.out.println(p);
	}

}
