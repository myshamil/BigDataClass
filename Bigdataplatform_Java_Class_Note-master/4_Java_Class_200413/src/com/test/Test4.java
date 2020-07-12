package com.test;

/* 
 * 상속과 메소드 상속에 대한 실습 
 */

class Student{
	public void gotoSchool() {System.out.println("Go to School");}
	public void study() {System.out.println("Do study");}
}

class MiddleStudent extends Student{
	public void study2() {System.out.println("Middle Study");}
}

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiddleStudent Ms = new MiddleStudent();
		Ms.gotoSchool(); // 부모 클래스 상속 받은 메소드 이용
		Ms.study(); // 부모 클래스 상속 받은 메소드 이용
		Ms.study2(); // 자기 메소드 이
	}

}
