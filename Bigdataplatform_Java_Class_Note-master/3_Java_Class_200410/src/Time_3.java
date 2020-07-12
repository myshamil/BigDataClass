
// 클래스 정의 연습 및 기본 생성자 연습 강₩

class Student3{
	
	public Student3() {
		System.out.println("Default Constructor");
		name = "Hong";
		age = 20;
	}
	
	public Student3(String str, int ag) {
		name = str;
		age = ag;
	}
	
	private String name;
	private int age;
	
	//오버로딩에 대한 연습
	//변수 갯수 차이에 따른 서로 다른 호출을 보여준다.
	public void setName(String nm) {name = nm;}
	public void setName(String nm, int age) {
		//Nothing to do
	};
	public void setAge(int ag) {age = ag;}
	
	public void gotoSchool() {};
}

public class Time_3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 stu = new Student3();
		stu.gotoSchool();
		
		Student3 stu2 = new Student3("Kim", 2);
		
	
	}

}
