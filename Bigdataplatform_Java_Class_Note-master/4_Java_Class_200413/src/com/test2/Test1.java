package com.test2;
/*
 * 연쇄 상속에 대한 학습.
 * 오버라이딩을 피하려면 Final로 작성한다.
 */


class A{
	void aMethod() {System.out.println("aMethod");}
//	final void aMethod() {System.out.println("aMethod");} // 오버라이딩을 피하려면 Final을 사용하고 상속방지 
}

class B extends A{
	void bMethod() {System.out.println("bMethod");}
	void aMethod() {System.out.println("aMethod on B Class");}
}

class C extends B{
	void cMethod() {System.out.println("cMethod");}
	void aMethod() {System.out.println("aMethod on C Class");}
}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new C();
		a.aMethod();
	}

}
