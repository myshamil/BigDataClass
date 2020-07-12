package com.test;

interface IAnimal11<T>{
	void set(T t);
	T get();
	void breath();
}

class Animal11<T> implements IAnimal11<T>{

	T animal;
	
	@Override
	public void set(T t) {
		this.animal = t;
	}
	
	@Override
	public T get() {
		return this.animal;
	}
	
	@Override
	public void breath() {
		System.out.println("Animal breath");
	}
}

class Dog11 {}

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Animal11<Dog11> a = new Animal11<Dog11>();
	a.set(new Dog11());
	Dog11 a1 = a.get();
	}

}
