package com.test;

class Store<T>{
	private T t;
	public void add(T t) {
		this.t = t;
	}
	public T getValue() {
		return this.t;
	}
}

class Box6<T, S>{
	private T t;
	private S s;
	
	public void add(T t, S s) {
		this.t = t;
		this.s = s;
	}
	
	public T getFirst() {
		return this.t;
	}
	public S getTwo() {
		return this.s;
	}
}

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box6<String, Integer> b = new Box6<String, Integer>();
		b.add("KKK", 1234);
		
		Store<String> s = new Store<String>();
		Store<String> st = new Store<String>();
		s.add("TEST");
		
		Box6<String, Store<String>> b2 = new Box6<String, Store<String>>();
		b2.add("LLL", st);
		b2.add("MMM", s);
	}

}
