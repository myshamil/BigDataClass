package com.test;

interface Animal5 {
//	void breath();
	String eat(String food);
}
//class Dog5 implements Animal5{
//	public void breath() {System.out.println("Dog");}
//}
//
//class Cat5 implements Animal5{
//	public void breath() { System.out.println("Cat");}
//	
//}

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Dog5 d = new Dog5();
//		d.breath();
//		
//		Cat5 c = new Cat5();
//		c.breath();
		
		
//		// 람다 사용 이전에 많이 사용되던 방식의 코드 
//		Animal5 a = new Animal5() {
//			public void breath() {System.out.println("Dog");}
//		};
//		a.breath();
//		
//		// 람다 사용 이전에 많이 사용되던 방식의 코드
//		Animal5 a1 = new Animal5() {
//			public void breath() {System.out.println("Cat");}
//		};
//		a1.breath();
		
		// 람다 방식의 코드 
		Animal5 al5 = (as) -> {System.out.println("DD"); return "";};		
		
		// 람다 방식의 코드 
		//Animal5 a3 = (as) -> {System.out.println("Dog"); return "";};
		 String str = al5.eat("저녁"); 
		
		
	}
}