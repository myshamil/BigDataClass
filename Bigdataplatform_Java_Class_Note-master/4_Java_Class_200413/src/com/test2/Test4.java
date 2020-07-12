package com.test2;

/*
 * 클래스 메소드 오버라이딩 실습.
 * 만약 데이터베이스를 상위클래스로 두고 데이터베이스를 끌어다 쓰는 다양한 프로그램이 있다고 할때 아래와 같이
 * 메소드를 오버라이딩하여 사용.
 */

class Data{
	void open() {System.out.println("Data Open");}
	
}

class Excel extends Data{
	void open() {System.out.println("Excel Open");}
}

class Word extends Data{
	void open() {System.out.println("Word Open");}
}

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data e = new Excel();
		e.open();
		
		Data d = new Word();
		d.open();
	}

}
