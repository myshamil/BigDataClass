package com.test;

/*
 * IAnimal -> Dog4(Class) -> Dog5(Class)
 */

interface IAnimal{
	void breath();
}

abstract class Dog4 implements IAnimal{
	public abstract void breath();
}

class Dog5 extends Dog4{
	public void breath() {
		System.out.println("Dog3 Breath");
	}
}

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IAnimal a = new Dog5();
		a.breath();
	}
}
