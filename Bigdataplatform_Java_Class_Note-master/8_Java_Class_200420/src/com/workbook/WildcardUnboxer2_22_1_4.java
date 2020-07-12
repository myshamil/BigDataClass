package com.workbook;

class Box10<T>{
	private T ob;
	public void set(T o ) { ob = o;}
	public T get() {return ob;}
	
	@Override
	public String toString() {
		return ob.toString();
	}
}

class Unboxer3{
	public static<T> T openBox(Box10<T> box) {
		return box.get();
	}
	
	public static void peekBox(Box10<?> box) { // 와일드카드 사용 
		System.out.println(box);
	}
}

public class WildcardUnboxer2_22_1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box10<String> box = new Box10<>();
		box.set("So Simple String");
		Unboxer3.peekBox(box);

	}

}
