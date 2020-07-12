package com.workbook;

class Box13<T>{
	private T ob;
	public void set(T o) { ob = o;}
	public T get() { return ob;}
}

class Toy13 {
	@Override
	public String toString() {
		return "I am a Toy";
	}
}

class BoxHandler {
	public static void outBox(Box13<Toy13> box) {
		Toy13 t = box.get();
		System.out.println(t);
	}
	
	public static void inBox(Box13<Toy13> box, Toy13 n) {
		box.set(n); // 상자에 넣기 
}
}

public class BoundedWildcrdBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box13<Toy13> box = new Box13<>();
		BoxHandler.inBox(box, new Toy13());
		BoxHandler.outBox(box);
	}

}
