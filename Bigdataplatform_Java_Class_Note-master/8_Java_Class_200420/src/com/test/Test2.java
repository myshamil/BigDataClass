package com.test;

/*
 * Generic에 대한 학습 예제.
 * 제네릭은 오브젝트 선언시 타입을 제한하고자 할 때 사용한다. 
 */

class Animal<T>{
	
	T b;
	void setBreath(T b) {this.b = b;}
	T getBreath() {return b;}
	
}

class Dog{
	//void bark() {System.out.println("Dog Bark");}
	@Override
	public String toString() {
		return "Dog";
	}
}

class Cat{
	//void meow() {System.out.println("Cat meow");}
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal<Dog> a = new Animal<Dog>();
		a.setBreath(new Dog());
		Dog d = a.getBreath();
		
		//Animal<Cat> c = new Animal<Cat>();
		System.out.println(d);
	}

}
