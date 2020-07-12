package com.workbook.practice_api;

import java.util.Arrays;

class Student2 implements Comparable{
	int rollno;
	String name;
	int age;
	
	public Student2(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Object o) {
		Student2 s = (Student2)o;
		if(this.age == s.age)
			return 0;
		else if(this.age > s.age)
			return 1;
		else
			return -1;
	}
	
	public String toString() {
		return name;
	}
}

public class compareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2[] stus = new Student2[3];
		stus[0] = new Student2(1, "KSM", 28);
		stus[1] = new Student2(1, "HHH", 18);
		stus[2] = new Student2(1, "LLL", 38);
		Arrays.sort(stus);
		
		for(Student2 s : stus) {
			System.out.print(s.toString());
			//System.out.println('\t' + s.age);
		}
	}

}
