package Inclass0416;
interface Animal{
	void breath(); //선언만 함. 규격화 필요. 
}
class Dog implements Animal{

	public void breath() {  	//규격화. 구현하지 않으면 동작이 되지 않음! 
		System.out.println("Dog breath");
	}
	public void bark() {
		System.out.println("Dog Bark");
	}
}
class Cat implements Animal {
	public void breath() {
		System.out.println("Cat breath");
	}
	public void meow() {
		System.out.println("Cat Meow");
	}
}

public class Test3 {
	static void test (Animal a) {
		a.breath();
	}
	
	public static void main(String[] args) {
		Dog d= new Dog(); //Animal을 바로 쓸순없고 dog 객체를 만들어서
		Animal a =d; //dog 객체로 animal타입. 
		a.breath();
		
		Cat c = new Cat();
		Animal h = c;
		h.breath();
		c.meow();
		
		test(new Dog());
	}

}
