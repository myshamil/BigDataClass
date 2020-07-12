package com.test;

/*
 * 클래스 상속에 관한 실습 진행 
 * 상속받은 하위클래스를 호출할 경우 상위 클래스부터 호출되어 진다는 것을 확인할 수 있다.
 * super를 이용해 하위 클래스 호출시 어떻게 응용되는지 확인해본다. 
 * super를 이용하면 상위 클래스 생성자 메소드에 맞추어 동작하게 된다.
 */

class AA{
	int aValue;
	public AA() {
		System.out.println("Default Constructor A");
		this.aValue = 10;
	}
	
	public AA(int aValue) {
		System.out.println("Constructor A_Super");
		this.aValue = aValue;
		System.out.println(this.aValue);
	}
}

class BB extends AA{
	int bValue; // 클래스 내의 변수와 생성자 내의 호출인자명이 동일하다. 
	public BB() {
		this.bValue = 100;
		System.out.println("Default Constructor B");	
	}
	public BB(int bValue) {
		super(300); // 여기서 상위클래스인 AA클래스의 생성자(int aValue) 메소드를 호출해서 실행 
		this.bValue = bValue;
		System.out.println("Overriding Constructor B");
		System.out.println("Constructor B " + bValue + "," + this.bValue);
	}
}


public class Inheritance_Practice_super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("Call A Class");
//		A a = new A();
		
		System.out.println("Call B Class");
//		BB b = new BB();
		BB b2 = new BB(20); //Overriding Class call
		
		
	}

}


/* Print Result
* 
* Call B Class
Constructor A_Super
300
Overriding Constructor B
Constructor B 20,20
*/