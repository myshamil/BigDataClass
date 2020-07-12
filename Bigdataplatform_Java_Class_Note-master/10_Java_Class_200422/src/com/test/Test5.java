package com.test;

class Calc2{
	public int add(int a, int b) {
		return a+b;
	}
	public static int subtract(int a, int b) {
		return a-b;
	}
}

public class Test5 {

	static int add2(int x, int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc2 c= new Calc2();
		int r = c.add(2, 3);
		System.out.println(r);
		
		int r2 = Calc2.subtract(4, 2);
		System.out.println(r2);
		
		int r3 = c.subtract(6, 4);
		System.out.println(r3);
		Test5.add2(4, 3);
		add2(4,3);
	}

}
