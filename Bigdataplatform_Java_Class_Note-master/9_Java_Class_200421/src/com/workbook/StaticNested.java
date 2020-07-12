package com.workbook;

/*
 * Inner Class 학습 예제.. 
 * Static, None-S의 경우를 학습한다. 
 * 
 */

class Outer{
	private static int num = 0;
	static class Nested1{
		void add(int n) {num += n;}
	}
	static class Nested2{
		int get() {return num;}
	}
	
	class Nested3 {
		void add2() {};
	}
}

public class StaticNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Nested1 nst1 = new Outer.Nested1(); // Static의 경우이다. 
		nst1.add(5);
		
		Outer.Nested2 nst2 = new Outer.Nested2();
		System.out.println(nst2.get());
		
		Outer o = new Outer();
		Outer.Nested3 nst3 = o.new Nested3(); // None - Static의 경우이다. 
	}

}
