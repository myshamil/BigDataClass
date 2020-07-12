package com.test;

class MobilePhone{
	protected String number;
	public MobilePhone(String num) {
		number = num;
	}
	public void answer() {
		System.out.println("HI ~ From " + number);
	}
}

class SmartPhone extends MobilePhone {
	private String androidVer;
	public SmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;
	}
	
	public void playApp() {
		System.out.println("App is running in " + androidVer);
	}
}

public class MobileSmartPhone_Workbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone phone = new SmartPhone("010-1234-1234", "Nougat");
		phone.answer();
		phone.playApp();

	}

}
