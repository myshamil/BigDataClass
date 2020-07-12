package com.workbook;

class Box11<T>{
	private T ob;
	public void set(T o) { ob = o;}
	public T get() { return ob;}
}

class Toy{
	@Override
	public String toString() {
		return "I am a Toy";
	}
}

class BoxContentsMover{
	public static void moveBox(Box11<? super Toy> to, Box11<? extends Toy> from) {
		to.set(from.get());
	}
}

public class MoveBoxContents_22_1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box11<Toy> box1 = new Box11<>();
		box1.set(new Toy());
		Box11<Toy> box2 = new Box11<>();
		
		// box1에 저장된 내용물 box2로 이동
		BoxContentsMover.moveBox(box2, box1);
		System.out.println(box2.get());
	}

}
