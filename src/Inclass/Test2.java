package Inclass;
class Animal{}
class Dog extends Animal {

}
public class Test2 {
	public static void main(String[] args) {
		Animal a = new Dog();
		if(a instanceof Dog) {
		Dog d = (Dog)a;
	}
		else if (a instanceof Animal) {
			System.out.println("Animal");
		}
	}
}
