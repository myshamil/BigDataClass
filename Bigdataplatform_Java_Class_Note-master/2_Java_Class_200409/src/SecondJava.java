class A{ // class Init
	
	int data = 50; //instance variable
	static int n = 100; // static variable
	
	void method() { 
		int n = 30; //local variable
	}
}

class Student{
	public String name;
	public static int age;
	public void goSchool(String name) {System.out.println("Mom," + name + " is Home ~");}
}

class Employee{
	public String worker;
	public static int num;
	public void goWork(String worker, int num) {System.out.println(worker + num);}
}

public class SecondJava {

	public static void main(String args[]) {
		System.out.println(A.n);
		A a = new A();
		System.out.println(a.data);
		
		Student Stu = new Student();
		Stu.goSchool("Tom");
		
		String str = "1234";
		int aa = Integer.parseInt(str);
		Integer a2 = new Integer(aa);
		String str2 = a2.toString();
		
		System.out.println(a2);
		System.out.println(str2);
		
		//--------------------------//
		
		Employee emp = new Employee();
		emp.goWork("TOM", 3);
		emp.worker = "SYS";
		emp.num = 5;
		emp.goWork(emp.worker, emp.num);
		
		Employee emp2 = emp;
		
		emp2.goWork(emp2.worker, emp2.num);
	
	}
}
