package com.workbook;

interface Eatable{
	public String eat();
}

class Apple4 implements Eatable{
	public String toString() {
		return "I am an apple";
	}
	
	@Override
	public String eat() {
		return "It tastes so good!";
	}
}

class Box5<T extends Eatable>{
	T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		System.out.println(ob.eat()); // Eatable로 제한하였기에 Eat 호출 가능 
		return ob;
	}
}


public class BoundedInterfaceBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box5<Apple4> box = new Box5<>();
		box.set(new Apple4()); // 사과 저장 
		
		Apple4 ap = box.get(); // 사과 꺼내기  // 여기서 It ~ 구문 호출 
		System.out.println(ap); // 여기서 I am 호출  
	}

}
