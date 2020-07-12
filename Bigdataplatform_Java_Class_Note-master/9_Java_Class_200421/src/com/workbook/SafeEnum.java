package com.workbook;

enum Animal{
	DOG, CAT
}

enum Person{
	MAN, WOMAN
}

public class SafeEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		who(Person.MAN);
//   		who(Animal.DOG); // who()는 Person형만 받는다. 
	}
	
	public static void who(Person man) {
		switch(man) {
		case MAN:
			System.out.println("남자입니다 ");
			break;
		case WOMAN:
			System.out.println("여자임미다 ");
			break;
		}
	}
}
