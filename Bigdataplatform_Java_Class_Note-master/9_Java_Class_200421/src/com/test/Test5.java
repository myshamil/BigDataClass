package com.test;

/*
 * 익명클래스 (Lamda)에 대해 학습한다. 
 * Anonymous Class 이다. 
 */

interface Animal{
	void breath();
}

class Dog implements Animal{ // 이렇게 직접 구조화 해서 사용해도 되며.. 
	@Override
	public void breath() {
		System.out.println("Dog breath");
	}
}

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.breath();
		
		Animal a = new Animal() { // 이렇게 익명화 해서 선언과 동시에 구현해서 사용해도 된다. 
			public void breath() { System.out.println("No");}
		};
		a.breath();
	}

}
