package com.test;

/*
 * Interface 연습 예제 
 * 
 */
interface Animal{
	void breath();
}

// 인터페이스는 상속이 불가하다. 즉 Extends는 불가능하다.
//class Dog extends Animal{
//	
//}

// 부모 인터페이스를 확장받으려면 무조건 메소드를 정의해주며 생성해야 한다.
class Dog implements Animal{
	public void breath() {
		System.out.println("Dog breath");
	}
	
	public void bark() {
		System.out.println("Dog bark");
	}
}

//부모 인터페이스를 확장받으려면 무조건 메소드를 정의해주며(부모 인터페이스 메소드 오버라이딩으로) 생성해야 한다.
class Cat implements Animal{
	public void breath() {
		System.out.println("Cat breath");
	}
	public void bark() {
		System.out.println("Cat meow");
	}
}

public class Test1 {

	static void test(Animal a) {
		a.breath();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		Animal a = d;
		
		Cat c = new Cat();
		Animal a2 = new Cat();
		
		
		// 인터페이스 확장간 오브젝트별 실행 가능 메소드 확인 
		a.breath();
		d.bark();
		d.breath();
		System.out.println();
		
		a2.breath();
		c.bark();
		c.breath();		
		System.out.println();
		
		test(new Dog());
		test(new Cat());
	}

}
