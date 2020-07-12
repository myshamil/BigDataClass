package com.Test1;

class User{
	public String id;
	public String password;
	
	@Override
	public boolean equals(Object o) {
		User user = (User)o;
		boolean checkFlag = false;
		if(this.id == "test" && this.password == user.password) {
			checkFlag = true;
		}
		return checkFlag;
	}
}

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User u = new User();
		u.id = "test";
		u.password = "1234";
		
		User u2 = new User();
		u2.id = "test";
		u2.password = "1234";
		
		if(u.equals(u2)) {
			System.out.println("Equal a user");
		}
		else {
			System.out.println("Not Equal");
		}
		
//		Object o = new Object();
//		Object o1 = new Object();
//		Object o2 = o;
//		if(o.equals(o2)) {
//			System.out.println("Equal");
//		} else {
//			System.out.println("No Equal");
//		}
	}

}
