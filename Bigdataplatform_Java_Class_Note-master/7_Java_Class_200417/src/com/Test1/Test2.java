package com.Test1;

class MyClass extends Object{
	public MyClass() {
		System.out.println("Default Constructor");
	}
	public String toString() {
		return "MyClass";
	}
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("End");
	}
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass a = new MyClass();
		System.out.println(a.toString());
		
		Object o = new Object();
		System.out.println(o.hashCode());
		
		Object o1 = o;
		System.out.println(o1.hashCode());
		
		Object o2 = new Object();
		System.out.println(o2.hashCode());
		System.out.println(o2.toString());
	}

}
