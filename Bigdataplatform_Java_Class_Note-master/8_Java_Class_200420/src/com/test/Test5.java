package com.test;

/*
 * 제네릭에 대한 학습 예제 세번째.. 
 * 클래스 옆에 <>형태로 표기를 하며 Object로 명시해도 되지만 아닐경우 <T>를 일반적으로 쓰며,
 * 더 세부적으로 제한하고자 할경우 데이터 타입(Integer, String)등을 명시해준다. 
 * 
 * 제네릭 < _ > 안에 명시해주는 종류는 아래와 같다.
 * E : Element
 * K : Key
 * N : Number
 * T : Type
 * V : Value
 */

class Apple extends Object{}

class Box3<T> extends Object{
	private T a;
	public Box3(T a) { // Object a = new Apple();
		this.a = a;
	}
	
	public void setBox(T a) {
		this.a = a;
	}
	
	public T getBox() {
		return this.a  = a;
	}
}

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o = new Apple();
		Object o1;
		o1 = new Apple();
		
		Box3<Apple> b = new Box3<Apple>(new Apple());
		Apple a = b.getBox();
	}

}
