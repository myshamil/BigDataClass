package Inclass0416;
abstract class Animal3{
	public abstract void breath();
	public void eat() {
		System.out.println("animal eats");
	}
}

class Dog3 extends Animal3 {
	public void breath() {
		System.out.println("Dog breath");
	}
}
public class Test6 {

	public static void main(String[] args) {
		Animal3 a = new Dog3();
		a.breath();

	}

}
