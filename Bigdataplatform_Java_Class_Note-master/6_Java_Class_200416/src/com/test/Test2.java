package com.test;

interface Animal2{
	void breath();
}

interface Insect2 {
	void breath();
}

class Beetle implements Animal2, Insect2{
	public void breath() {
		System.out.println("Breath Beetle");
	}
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal2 a = new Beetle();
		a.breath();
		
		Insect2 i = new Beetle();
		i.breath();
	}

}
