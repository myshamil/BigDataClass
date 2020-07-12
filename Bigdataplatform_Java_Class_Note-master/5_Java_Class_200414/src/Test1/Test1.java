package Test1;
/*
 * Instanceof 예제 실습 
 */


class A{
	void aMethod() {System.out.println("aMethod");}
}
class B extends A{
	void bMethod() {System.out.println("bMethod");}
}


public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		String className = b.getClass().getSimpleName();
		System.out.println(className);
		if(className.equals("B")) {
			System.out.println("B O.K");
		}
		if(b instanceof B) {
			System.out.println("B O.K2");
		}
		
		boolean check1 = b instanceof B;
		System.out.println(check1);
		
		B b1 = null;
		boolean check2 = b1 instanceof B;
		System.out.println(check2);
		
	}

}
