package com.test;

/*
 * 클래스 상속간 메소드 오버라이딩 동작 확인 
 */

class A_1{
	void aMethod() {
		System.out.println("aMethod");
	}
}

class B_1 extends A_1{
	void bMethod() {
		System.out.println("bMethod");
	}
	void aMethod() {
		System.out.println("aMethod on B_1 Class");
	}
	
}

class C_1 extends A_1{
	void cMethod() {System.out.println("cMethod");}
	void aMethod() {System.out.println("aMethod on C_1 Class");}
}

public class Test10 {

	static void callMethod(B_1 b) {
		b.aMethod();
	}
	static void callMethod(C_1 c) {
		c.aMethod();
	}
	static void callMethod2(A_1 a) {
		a.aMethod();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stu
//		B_1 b = new B_1();
//		b.aMethod();
//		b.bMethod();
//		A_1 a = b;
//		
//		a.aMethod();
//		B_1 b1 = (B_1)a;
//		b1.aMethod();
//		b1.bMethod();
//		
//		C_1 c = new C_1();
//		c.aMethod();
//		c.cMethod();
//		A_1 a2 = c;
//		C_1 c2 = (C_1)a2;
//		c2.aMethod();
//		c2.cMethod();
		
//		B_1 b2 = new B_1();
//		A_1 a2 = (b2;
		
		callMethod(new B_1());
		callMethod(new C_1());
		callMethod2(new A_1());
		callMethod2(new B_1());
		callMethod2(new C_1());
		
	}

}
