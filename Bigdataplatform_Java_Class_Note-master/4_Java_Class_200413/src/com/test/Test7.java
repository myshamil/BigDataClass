package com.test;

/*
 * this, super Class의 사용 예제
 * 하위 클래스 인스턴스 생성시 super를 이용하여 상위클래스 정의 
 */

class Student5{
	String name;
	int age;
	public Student5(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class HighStudents5 extends Student5{
	int grade;
	public HighStudents5(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
	}
	void setNameAge(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void study() {
		System.out.println(name + ", " + age + ", " + grade);
	}
}

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HighStudents5 stu = new HighStudents5("KSM", 20, 1);
		stu.study();

	}

}
