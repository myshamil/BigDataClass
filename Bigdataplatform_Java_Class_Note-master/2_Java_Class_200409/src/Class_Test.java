
class Calc{
	public int add(int a, int b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public static int add2(int a, int b) {
		return a+b;
	}
	
	public static int sub2(int a, int b) {
		return a-b;
	}
}

public class Class_Test {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc c = new Calc();
		System.out.println(c.add(3, 5));
		System.out.println(c.add2(3, 5));
		
		
	}

}
