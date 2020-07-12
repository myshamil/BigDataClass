package com.test;


// 인터페이스 선언 with 메소드 
interface Shape{
	void draw(int x, int y);
}

// 클래스 선언 및 인터페이스 확장
class Circle implements Shape{
	public void draw(int a, int b) {
		System.out.println("Draw a Circle : " + a + ", " + b);
		System.out.println("Circle S is  : " + a*b);
	}
}

//클래스 선언 및 인터페이스 확장
class Rectangle implements Shape{
	public void draw(int a, int b) {
		System.out.println("Draw a Rectangle : " + a + ", " + b);
		System.out.println("Rectangle S is  : " + (a+b));
	}
}

class DrawManager{
	Shape s;
	public DrawManager(Shape s) { // 생성자에서 인터페이스 타입을 받을 수 있다. 
		this.s = s;
	}
	
	public void draw(int s, int t) { // 인터페이스 메소드 오버라이딩 
		this.s.draw(s, t);
	}
}

public class IShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawManager d = new DrawManager(new Rectangle());
		d.draw(1, 2);
		
	}

}
