package com.workbook;

/*
 * 익명클래스 기반 학습 예제이다. 
 * 람다가 등장하기 이전에 주로 사용하던 코드 스타일이다.
 */

interface Printable{
	void print();
}

class Papers {
	private String con;
	public Papers(String s) {con = s;}
	
	public Printable getPrinter() {
		return new Printable() {
			public void print() {
				System.out.println(con);
			}
		};
	}
}

public class UseAnonymousInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Papers p = new Papers("서류 내용 : 행복합니다. ");
		Printable prn = p.getPrinter();
		
		prn.print();
		
	}

}
