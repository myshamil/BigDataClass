package com.test;

import java.util.function.*;;
interface Database2{
	void open(String dbName);
}

public class Consumer_Accept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database2 db = (dbName) -> {
				System.out.println(dbName + " open");
			};
		
		Consumer<String> o = (dbName) -> {System.out.println(dbName + " open");
	};
	o.accept("Database");

}
}
