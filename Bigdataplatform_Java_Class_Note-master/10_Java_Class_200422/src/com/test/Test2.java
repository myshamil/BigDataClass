package com.test;

interface Database{
	void open();;
}


public class Test2 {

	static void test(Database d) {}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database db = new Database() {
			public void open() {System.out.println("Database open");}
			};
		db.open();
		
		Database db2 = () -> {System.out.println("Database open");};
		db2.open();
		test(db2);
		
		test(() -> {System.out.println("Database open");});
	}
}

