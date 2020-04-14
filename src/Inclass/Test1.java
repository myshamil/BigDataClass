package Inclass;
class A{
	void aMethod() { System.out.println("aMehtod");}
	
}
class B extends A{
	void bMethod() {System.out.println("bMethod");}
	
}
public class Test1 {
	public static void main(String[] args) {
		B b = new B();
		String className = b.getClass().getSimpleName();
		System.out.println(className);
		if(className == "B") {
			System.out.println("B OK");
		}
		if (b instanceof B ) {
			System.out.println("B Ok2 ");
		}
		boolean check1 = b instanceof A;
		System.out.println(check1);
		B b1 = null;
		boolean check2 = b1 instanceof A;
		System.out.println(check2); //연산자 하나로 확인 할 수 있다. 
	}
}
