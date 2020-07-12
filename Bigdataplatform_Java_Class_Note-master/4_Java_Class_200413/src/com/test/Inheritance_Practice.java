package com.test;

/*
 * 클래스 상속에 관한 실습 진행 
 * 상속받은 하위클래스를 호출할 경우 상위 클래스부터 호출되어 진다는 것을 확인할 수 있다.
 * this를 이용해 자기자신을 가르킨다는, 클래스 호출시 어떻게 응용되는지 확인해본다. 
 */

class A{
	int aValue;
	public A() {
		System.out.println("Default Constructor A");
		this.aValue = 10;
	}
}

class B extends A{
	int bValue; // 클래스 내의 변수와 생성자 내의 호출인자명이 동일하다. 
	public B() {
		this.bValue = 100;
		System.out.println("Default Constructor B");	
	}
	public B(int bValue) {
		this.bValue = bValue;
		System.out.println("Overriding Constructor B");
	}
}


public class Inheritance_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Call A Class");
		A a = new A();
		
		System.out.println("Call B Class");
		B b = new B();
		B b2 = new B(20); //Overriding Class call
		
	
	}

}
