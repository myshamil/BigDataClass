package com.workbook;

/*
 * 인터페이스 선언, 확장, 메소드 오버라딩에 대한 실습 예제 
 */

//인터페이스 선언
interface Printable2{
	void print(String doc);
}

// 인터페이스를 확장받은 클래스 
class Prn204Drv2 implements Printable2{
	@Override
	public void print(String doc) { // 인터페이스 메소드 오버라이드 
		System.out.println("From MD-204 printer");
		System.out.println(doc);
	}
}

//인터페이스를 확장받은 클래스 
class Prn731Drv2 implements Printable2{
	@Override
	public void print(String doc) { // 인터페이스 메소드 오버라이드
		System.out.println("From MD-731 printer");
		System.out.println(doc);
	}
}


public class PrinterDriver2_Workbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myDoc = "This is a report about...";
		
		Printable2 prn = new Prn204Drv2();
		prn.print(myDoc);
		System.out.println();
		
		prn = new Prn731Drv2();
		prn.print(myDoc);
	}

}
