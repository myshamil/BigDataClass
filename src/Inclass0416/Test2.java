package Inclass0416;
class Student{
	//member variables
	protected String name;
	protected int age;
	//constructors
	public Student()	{
		this.name= "Jack";
		this.age=20;
	}
	//constructor overloading
	public Student (String name, int age) {
		this.name = name;
		this.age = age;
	}
	//member method
	public void studying() {
		System.out.println("Student Studying");
	}
	//method overloading
	public void studying(String msg) {
		System.out.println("Student studying "+ msg);
	}
}

class MiddleStudent extends Student{
	int grade;
	public MiddleStudent() {
		this.name="Eliz";
		this.age= 16;
		this.grade= 3; //������ ���Ǿ��ص� ��...
	}
	public MiddleStudent(String name, int age, int grade) {
		this.name = name;
		this.age = age;		
		//super(name, age); <<���� student ������ �ʱ�ȭ�� ��Ų��. 
		this.grade= grade;
	}
	public void playgame() {
		System.out.println("MiddleStudent play game.");
	}
	//student������ studying�� middle���� ������ 
	public void studying() {
		System.out.println("MiddleStudent Studying");
	}
	public void studying(String msg) {
	System.out.println("MiddleStudent studying "+ msg);
	}
}
public class Test2 {
	public static void main(String[] args) {
//		Student stu =new Student();
//		MiddleStudent midStu = new MiddleStudent();
//		MiddleStudent midstu2 = new MiddleStudent("Seb", 23, 4);
//		midstu2.studying("FF");
//		midstu2.playgame();
		
		Student midStu3 = new MiddleStudent("Pram", 30, 2);
		midStu3.studying();
		midStu3.studying("Java"); //�������� ������ ���´�. 
		MiddleStudent stu3 = (MiddleStudent) midStu3;
		stu3.studying();
		stu3.studying("Math");
		stu3.playgame();
	}
}
