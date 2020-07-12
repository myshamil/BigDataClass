// 클래스를 이용한 캡슐화 실
// 게터와 세터의 사용법에 대해 배웁니다.


class Student2{
	public Student2() {  // 리턴 타입이 없는 클래스 내 퍼블릭은 기본 생성자(Default Constructor)이다. 
		System.out.println("Default Constructor");
	}
	private String name;
	public void setName(String nm) {
		name = nm;
	}
	public String getName() {
		return name;
		}
	public void gotoSchool() {
		System.out.println(name + " will go this shcool");
	}
}

public class Time_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 stu = new Student2();
		stu.setName("Lee");
		stu.gotoSchool();
		System.out.println(stu.getName());
		
		Student2 stu2;
		stu2 = new Student2();
		//stu2.setName(stu.getName());
		stu2.setName("Kim");
		stu2.gotoSchool();
		
		Student2 t = execute(stu2);
		t.gotoSchool();
		
		Student2 stu3 = new Student2();
		Student2 t2 = execute(stu2);
		Student2 t3 = execute(new Student2());
	}
	
	static Student2 execute(Student2 s) {
		s.gotoSchool();
		return s;
	}

	static void test2(String name, int age, int height) {
		
	}
}
