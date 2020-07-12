package com.test;

class Calculator{

	int result;
	public Calculator() { //Default Constructor
		result = 0;
	}
	public Calculator(int r) { // Constructor overriding with variable
		result = r;
	}

	int add(int a, int b) { //{return a + b;} // Inline Function
		int result = a+b;
		return result;	
	}
	
	int substract(int a, int b) {
		int result = a - b;
		return result;
	}
	
	int add(int a, int b, int c) { // Function overriding
		int result = a+b+c;
		return result;
	}
}


public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
