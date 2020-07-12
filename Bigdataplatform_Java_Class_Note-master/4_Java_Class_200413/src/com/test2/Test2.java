package com.test2;

/*
 * Interface, Overriding에 대한 예제 
 */

interface Printable{
	public void print(String doc);
}

class Printer implements Printable{
	@Override
	public void print(String doc) {
		System.out.println(doc);
	}
}

public class Test2{
	public static void main(String[] args) {
	Printable prn = new Printer();
	prn.print("Hello Java");
}
}