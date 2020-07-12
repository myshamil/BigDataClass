package com.test;

/*
 * 추상 메소드 Abstract class에 대한 예제 
 */

abstract class Animal3 { // 추상 클래스 
	public abstract void breath(); // 추상 메소드 / 아무것도 구현되어있지 않다.  
	public void eat() { System.out.println("Animal eat");}
}

class Dog3 extends Animal3 {
	public void breath() {
		System.out.println("Dog breath");
	}
}

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal3 a = new Dog3();
		a.breath();
	}

}
