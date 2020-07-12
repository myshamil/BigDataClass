package com.Test1;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 1/0;
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());			
		}
		finally {
			System.out.println("End");
		}
	}

}
