package Test1;

/*
 * Object Type Casting에 대해 instanceof 비교 실습 
 */
class Animal{}
class Dog extends Animal{}


public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Dog();
		if(a instanceof Dog) {
			Dog d = (Dog)a;
			System.out.println(a.equals(d));
		}

	}

}
