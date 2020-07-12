package com.test;

/*
 * 클래스 상속에 관한 실습 진행 
 * 상속받은 하위클래스를 호출할 경우 상위 클래스부터 호출되어 진다는 것을 확인할 수 있다.
 * this, super 이용해 클래스 호출시 어떻게 실행되며 변수가 들어가는지 확인해본다.
 */

class Student4{
	String name;
	public Student4(String name) {
		this.name = name;
	}
}

class MiddleStudent4 extends Student4{
	int age;
	public MiddleStudent4(String name, int age) {
		super(name);
		this.age = age;
		System.out.println(name + ", " + age);
	}
}

public class Super_this_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiddleStudent4 ms4 = new MiddleStudent4("KSM", 28);
	
	}

}
