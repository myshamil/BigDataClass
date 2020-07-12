package com.workbook;

class Box9<T>{
	private T ob;
	public void set(T o) {ob = o;}
	public T get() {return ob;}
	
	@Override
	public String toString() {
		return ob.toString();
	}
}

class UnBoxer2{
	public static <T> T openBox(Box9<T> box) {
		return box.get();
	}
	
	// 상자 안의 내용물을 확인하는(출력) 기능의 제네릭 메소드 
	public static <T> void peekBox(Box9<T> box) {
		System.out.println(box);
	}
}


public class WildcardUnboxer_22_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box9<String> box = new Box9<>();
		box.set("So Simple String");
		UnBoxer2.peekBox(box); // 상자 안의 내용물을 확인한다. 

	}

}
