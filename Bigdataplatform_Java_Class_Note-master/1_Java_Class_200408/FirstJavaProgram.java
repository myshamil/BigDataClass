import java.io.IOException;


/*
 * - static 멤버
 *   -> static 멤버의 개념
 *     - 객체를 생성하지 않고 사용할 수 있는 멤버
 *     - 클래스의 모든 객체에 공통으로 사용되는 변수
 *     - 클래스의 어떤 멤버도 static 멤버에 접근할 수 있음
 *     - C/C++의 전역 변수와유사함
 *   -> static 멤버의 선언 방법
 *     - 멤버(필드 혹은 메소드) 앞에 static을 붙인 후 사용
 *       ex) static int number;
 *   -> static 멤버의 사용 방법
 *     - 객체.static멤버
 *       ex) Sample s = new Sample(); s.number = 10;
 *     - 클래스이름.static멤버
 *       ex) Sample.number = 10;
 *   -> static 멤버를 사용하는 이유
 *     - 전역 변수나 전역 함수를 만들 때 사용
 *       -> 모든 클래스에서 공유하는 혹은 언제든 호출할 수 있는 전역 변수를 만들어 사용할 때
 *       -> 객체를 생성하지 않고 바로 사용할 때
 *     - 공유 멤버를 만들고자 할 때 사용
 *       -> static으로 선언된 멤버는 모두 공통 멤버가 되어 객체들 사이에서 공유됨
 *   -> static 메소드의 제약 조건
 *     - 오직 static 멤버만 접근이 가능
 *     - this 키워드 사용이 불가능
 *       -> 객체가 생성되지 않은 상황에서도 사용이 가능하므로 
 *
 * ---------------------------------------------------------
 * Final 표현의 사용
 * 1. 변수의 값을 불변
 *
 * 2. 메소드 재정의 불가
 *
 * 3. 상속 불가 클래스
 */

public class Main {

	public static void main(String[] args) {

		// 객체 생성 후 사용
		Element e1 = new Element();
		e1.num1 = 5;
		System.out.println(e1.num1);
		e1.method01();
		System.out.println(e1.num1);
		// static 멤버가 아니기때문에 값이 변하지 않음
		e1.method02();
		System.out.println(e1.num1);
		
		System.out.println();
		
		// 객체 생성 없이 사용
		Element.num2 = 5;
		System.out.println(Element.num2);
		Element.method02();
		System.out.println(Element.num2);
		
		// static 멤버가 아닌 경우 객체 생성 없이 사용이 불가
		// Element.num1 = 5;
		// Element.method01();
		
	}

}


class Element {
	
	int num1;
	static int num2;
	
	void method01() {
		num1 = 10;
	}
	
	static void method02() {
		num2 = 20;
	}
	
}
[출처] [Java] static 멤버|작성자 Jacob


public class FirstJavaProgram {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		boolean c = (a==b);
		
		System.out.println(c);
		System.out.println("(a == b) : " + (a != b));
		
		boolean a1 = false;
		boolean a2 = true;
		boolean a3 = a1 && a2;
		boolean a4 = a1 || a2;
		
		System.out.println(a3+ " " + a4);
		
		boolean b1  = !(a1 && a2);
		boolean b2  = (a1 && a2) || !(a1);
		
		System.out.println(b2);
		
		int k = 1;
		int l = k++;
		int m = ++k;
		
		System.out.println(l);
		System.out.println(m);
		
		boolean choice = true;
		if(choice == true) {
			System.out.println("OK");
		}
		else {
			System.out.println("Cancel");
		}
		
//		int num = System.in.read();
//		System.out.println("Num : " + num);
		
		java.util.Scanner scan = 
				new java.util.Scanner(System.in);
		System.out.print("name : ");
		String name = scan.nextLine();
		System.out.println(name);
		
		if(name.equals("Lee")) {
			System.out.println("Its Same");
		}
		else {
			System.out.println("Not Same");
		}
		
	}
	
}
