/*
 * SubscriberTest실행 클래스의 형태를 보고 생성자를 포함하는 클래스를 정의해보라.
 */

package Workshop_2_2;

class SubscriberInfo{
	
	String name;
	String id;
	String password;
	String phoneNo;
	String address;
	
	public SubscriberInfo() {
//		this.name = "미입력";
//		this.id = "미입력";
//		this.password = "미입력";
//		this.phoneNo = "미입력";
//		this.address = "미입력";
	} // Default Constructor
	
	
	// Second Constructor with 3 variable
	public SubscriberInfo(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}
	
	
	// Third Constructor with 5 variable
	public SubscriberInfo(String name, String id, String password, String phoneNo, String address) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.phoneNo = phoneNo;
		this.address = address;
	}
	
	// Setter function // address, setPhoneNo
	public void setAddress(String address) {this.address = address;}
	public void setPhoneNo(String phoneNo) {this.phoneNo = phoneNo;}
	public void printSubscriberInfo() {}
}

public class SubscriberInfoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubscriberInfo obj1, obj2, obj3;
		obj1 = new SubscriberInfo("박유신", "1017db", "daewi");
		obj2 = new SubscriberInfo("백곰 ", "baekom", "white", "200-000-0000", "north pole");
		obj3 = new SubscriberInfo();
		printSubscriberInfo(obj1);
		printSubscriberInfo(obj2);
		printSubscriberInfo(obj3);
		obj1.setAddress("교직원 1숙사 ");
		obj1.setPhoneNo("133-1234-5678");
		printSubscriberInfo(obj1);
	}

		static void printSubscriberInfo(SubscriberInfo obj) {
			System.out.println("이름 : " + obj.name);
			System.out.println("아이디 : " + obj.id);
			System.out.println("패스워드 : " +obj.password);
			System.out.println("전화번호 : " + obj.phoneNo);
			System.out.println("주소 : " + obj.address);
			System.out.println();
		}
}
