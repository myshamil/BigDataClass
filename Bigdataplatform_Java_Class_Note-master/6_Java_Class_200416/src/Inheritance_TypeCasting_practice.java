
// Parent Class
class Student{
	protected String name;
	protected int age;
	
	//Default constructor 
	public Student() {
		this.name = "KSM";
		this.age = 28;
	}
	
	//Overriding constructor
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	// method overriding example
	public void studying() {System.out.println("Student studying");}
	public void studying(String msg) {System.out.println("Student studying " + msg);}
}

// sibling class 
class MiddleStudent extends Student{
	int grade;
	public MiddleStudent() { //Default constructor
		this.name = "KKK"; // 상속을 받았기 때문에 부모 클래스에서는 protected로 선언 
		this.age = 40;
		this.grade = 50;
	}
	// overriding constructor
	public MiddleStudent(String name, int age, int grade) {
		super(name, age);
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	public void playingGame() {System.out.println("MiddleStudent playing game");}
	public void playingGame(String msg) {System.out.println("MS playing game with " + msg);}
}


public class Inheritance_TypeCasting_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		MiddleStudent midstud = new MiddleStudent();
		
		MiddleStudent midstud2 = new MiddleStudent("JKL", 25, 50);
		midstud2.studying("Nintendo");
		midstud2.playingGame();
		
		// (Sibling)MiddleStudent Object, (Parent) Student Type
		Student midstu3 = new MiddleStudent("LLL", 100, 100);
		midstu3.studying();
		midstu3.studying("PS4");
		
		// Type Casting
		MiddleStudent midstu4 = (MiddleStudent) midstu3;
		midstu4.studying();
		midstu4.playingGame("XBOX");
		
	}

}
