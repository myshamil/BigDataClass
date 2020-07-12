package com.workbook;

class Apple2{
	public String toString() {
		return "I am an apple";
	}
}

class Orange2{
	public String toString() {
		return "I am an orange";
	}
}

class Box2<T>{
	private T ob;
	
	public void set(T o ) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}

public class FruitAndBoxFault_Generic {

	public static void main(String[] args) {
		
		
		
		
		// TODO Auto-generated method stub
		Box<Apple> aBox2 = new Box<Apple>();  // 여기서 스트링 타입으로 주어야 한다. 
		Box<Orange> oBox2 = new Box<Orange>(); // 여기서 스트링 타입으로 주어야 한다. 
		
		
		
//		aBox.set("Apple"); // 프로그래머의 실수 
//		oBox.set("Orange"); // 프로그래머의 실수 
		
		
//		Apple2 ap = aBox2.get(); // Get 타입 미스매치 
//		Orange2 og = oBox2.get(); 
		
		
		
//		System.out.println(ap);
//		System.out.println(og);
		
	}

}
