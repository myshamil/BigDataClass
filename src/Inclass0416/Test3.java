package Inclass0416;
interface Animal{
	void breath(); //���� ��. �԰�ȭ �ʿ�. 
}
class Dog implements Animal{

	public void breath() {  	//�԰�ȭ. �������� ������ ������ ���� ����! 
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
		Dog d= new Dog(); //Animal�� �ٷ� �������� dog ��ü�� ����
		Animal a =d; //dog ��ü�� animalŸ��. 
		a.breath();
		
		Cat c = new Cat();
		Animal h = c;
		h.breath();
		c.meow();
		
		test(new Dog());
	}

}
