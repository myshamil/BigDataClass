package com.test;


/*
 * static은 static만 컨트롤 할 수 있다.
 * 최초 생성 후 계속 유지되며 공유된다.
 */

class Myclass3{
	int a;
	static int b;
	public Myclass3() {}
	public static void setAValue(int x) {
		b = x;
		System.out.println(b);
//		a = y;
	}
	public void setBValue(int y) {
		a = y;
		System.out.println(a);
	}
}

// Static 변수 초기화 스킬 
class Myclass4{
	static int a;
	static int b;
	static {
		a = 1;
		b = 2;
		System.out.println("Static Initialize");
	}
}

public class Test9 {
	public static void main(String[] args) {
		Myclass3.b = 20;
		Myclass3 m = new Myclass3();
		m.a = 10;
		m.b = 20;
		m.setAValue(10);
		m.setBValue(20);
		
		Myclass4 m4 = new Myclass4();
	}
}
