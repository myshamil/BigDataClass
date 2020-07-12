package com.test;

import com.test.School.Nested;

class School{
	private int m = 10;
	class Student{
		void msg() {System.out.println(m);}
	}
	
	static class Nested{
		void push() {System.out.println("Push");}
	}
}

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School s = new School();
		School.Student s3 = s.new Student(); // None - Static의 경우 이렇게 상위 클래스.하위클래스 = 인스턴스.new 로 작성 
		
		Nested s4 = new School.Nested(); // Static의 경우 바로 클래스 호출 후 = new 상위 클래스.하위 Static클래스 로 접근 
//		School.Nested s = s.push();
//		n.push();
		s3.msg();
	}

}
