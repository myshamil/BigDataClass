package com.workbook;

/*
 * 인터페이스 선언, 확장, 메소드 오버라딩에 대한 실습 예제 
 */

// 인터페이스 선언 
interface Printable3{
	void print(String doc);
}

// 인터페이스 선언 및 상속 
interface ColorPrintable extends Printable3{
	void printCMYK(String doc);
}

// 클래스 선언 및 확장 
class Prn909Drv implements ColorPrintable{
	@Override // 부모 인터페이스 오버라이딩 
	public void print(String doc) {
		System.out.println("From MD-909 black & white ver");
		System.out.println(doc);
	}
	
	@Override // 자식 인터페이스 오버라이딩 
	public void printCMYK(String doc) {
		System.out.println("From MD-909 CMYK ver"); 
		System.out.println(doc);
	}
}

public class PrinterDriver3_Workbook {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myDoc = "This is a report about...";
		ColorPrintable prn = new Prn909Drv();
		prn.print(myDoc);
		System.out.println();
		prn.printCMYK(myDoc);
	}

}
