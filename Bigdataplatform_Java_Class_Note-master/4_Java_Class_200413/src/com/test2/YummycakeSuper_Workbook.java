package com.test2;

class Cake{
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}

class CheeseCake extends Cake{
	public void yummy() {
		super.yummy();
		System.out.println("Yummy Cheese Cake");
	}
	
	public void tasty() {
		super.yummy();
		System.out.println("Yummy Tasty Cake");
	}
}

public class YummycakeSuper_Workbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			CheeseCake cake = new CheeseCake();
			cake.yummy();
			cake.tasty();

	}

}
