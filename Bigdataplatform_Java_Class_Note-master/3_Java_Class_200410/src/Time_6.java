
public class Time_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d = new Dog();
		d.breath();
		
		Cat c = new Cat();
		c.breath();
		
		Animal a = new Dog();
		a.breath();
		
		Animal a1 = new Cat();
		a1.breath();
		
		Test(a);
		Test(a1);
	}
	
	
		static Animal Test(Animal a) {
			return new Dog();		
	}
		
		
}