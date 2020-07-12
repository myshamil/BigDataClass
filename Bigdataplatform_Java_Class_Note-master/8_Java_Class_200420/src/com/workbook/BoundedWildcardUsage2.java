package com.workbook;

class Box14<T>{
	private T ob;
	public void set(T o) { ob = o;}
	public T get() { return ob;
	}
}

class Toy14{
	@Override
	public String toString() {
		return "I am a Toy";
	}
}

class BoxHandler14{
	public static void outBox14(Box14<? extends Toy14> box) {
		Toy14 t = box.get();
		System.out.println(t);
	}
	public static void inBox14(Box14<? super Toy14> box, Toy14 n) {
		box.set(n);
	}
}

public class BoundedWildcardUsage2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box14<Toy14> box = new Box14<>();
		BoxHandler14.inBox14(box, new Toy14());
		BoxHandler14.outBox14(box);
	
	}

}
