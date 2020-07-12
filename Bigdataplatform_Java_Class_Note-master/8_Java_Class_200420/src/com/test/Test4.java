package com.test;

import java.util.ArrayList;

/*
 * 제네릭에 대한 학습 예제 두번째.
 * Box를 정의한 후 호출 시 각각 Int, String 타입을 결정해준 후 값을 add해서 출력한다. 
 */

class Box<T> {
	private T t;
	public void add(T t) {
		this.t = t;
	}
	public T get() {
		return this.t;
	}
}


// MyArr 클래스 정의 
class MyArr<T>{
	private ArrayList<T> al;
	public MyArr(int size) {
		this.al = new ArrayList<T>();
	}
	public void setAl(T v) {
		al.add(v);
	}
	public T getAl(int inx) {
		return al.get(inx);
	}
}

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> b1 = new Box<Integer>();
		b1.add(new Integer(2));
		Box<String> s1 = new Box<String>();
		s1.add("Hello Java");
		System.out.println(b1.get());
		System.out.println(s1.get());
	}

}
