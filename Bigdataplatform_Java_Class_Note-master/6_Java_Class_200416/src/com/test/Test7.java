package com.test;

// Custom Exception을 정의한 후 Exception(기존 클래스)로부터 상속받는다.
class MyException extends Exception{
	public MyException() {
		super("나의 예외처리입니다. ");
	}
}

public class Test7 {

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		int n = 3;
		if(n == 3) {	
			try { 
			throw new MyException(); // 의도적으로 throw를 발생시킨다. 
		} catch (MyException e) { //catch를 붙이면 처리하고 없으면 넘어간다. 
			System.out.println(e.getMessage()); // Exception에서 작성한 메세지를 붙잡아 출력한다.
		}
	}
	}
}
