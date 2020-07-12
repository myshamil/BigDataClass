package com.test2;

/*
 * super 클래스에 대한 오버라이딩 연습 예제 
 * Workbook 341 P
 */

class Cake2{
	public int size;
	
	public Cake2(int sz) {
		size = sz;
	}
	public void showCakeSize() {
		System.out.println("Bread ounces : " + size);
	}
}

class CheeseCake2 extends Cake2{
	public int size;
	public CheeseCake2(int sz1, int sz2) {
		super(sz1);
		size = sz2;
	}
	public void CheeseCake2() {
		//super.size는 상위 클래스의 멤버 size를 의미함
		System.out.println("Bread ounces : " + super.size);
		
		//size는 이 클래스 CheeseCake의 멤버 size를 의미함.
		System.out.println("Cheese Ounces : " + size);
	}
}

public class YummycakeSize_Workbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheeseCake2 ca1 = new CheeseCake2(5,7);
		Cake2 ca2 = ca1;
		
		// ca2는 cake형이므로 ca2.size는 Cake의 멤버 Size를 의미함
		System.out.println("Bread Ounces: " + ca2.size);
		
		// ca은 CheeseCake형이므로 ca1.size는 CheeseCake의 멤버 size를 의미함
		System.out.println("Cheese Ounces: " + ca1.size);
		System.out.println();
		
		ca1.showCakeSize();
		//System.out.println();
		ca2.showCakeSize();
	}

}
