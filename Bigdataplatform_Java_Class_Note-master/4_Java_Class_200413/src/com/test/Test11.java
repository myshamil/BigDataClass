package com.test;

/*
 * 클래스 메소드 오버라이딩 연습
 * 객체 타입 캐스팅, 오브젝트에 따른 결과 확인 
 */


class Animal2{
	void move() { System.out.println("Animal Move");}
}

class Dog2 extends Animal2 {
	void move() {System.out.println("Dog move");}
}

class Cat2 extends Animal2{
	void move() {System.out.println("Cat move");}
}

public class Test11 {

	static void goMove(Animal2 a) {
		a.move();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal2 a = new Animal2();
		a.move();
		Dog2 d = new Dog2();
		d.move();
		Animal2 a2 = new Dog2();
		a2.move();
		
		Cat2 c = new Cat2();
		c.move();
		Animal2 a3 = new Cat2();
		a3.move();
		
		goMove(a); //Animal 객체로 Animal move 출력 
		goMove(a2); // Dog 객체를 애니멀타입으로 변환하여 Dog move 출력  
		goMove(a3); // Cat 객체를 애니멀타입으로 변환하여 Cat move 출력 
	}

}
