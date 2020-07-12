package ws3.java2.controller;

import java.util.*;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import ws3.java2.entity.*;

public class VehicleManager{

	// Coding Process 2-A번 // 생성자 정의 
	List<Vehicle> VehicleList = new ArrayList<>();
	
	public VehicleManager() {
		
		// Coding Process 2-B 번 // 생성자에 값 할당 
		VehicleList.add(new Airplane("Boing - 747", 1300, 300, 4));
		VehicleList.add(new Airplane("F-16", 1600, 1, 1));
		VehicleList.add(new Car("Sonata - 3", 180, 5, 10));
		VehicleList.add(new Car("Tico", 130, 4, 15));
		VehicleList.add(new Car("Starex", 150, 10, 11));
		VehicleList.add(new Ship("Cruse2", 30, 400, 35000));
		VehicleList.add(new Ship("Notilus", 25, 150, 15000));
	}
	
	
	// 기본 출력 메소드 
	public void displayVehicles(String title) {
		System.out.println(title);
		for (int inx = 0 ; inx < VehicleList.size() ; inx++) {
			Vehicle vl = VehicleList.get(inx);
			vl.displayInfo();
			vl.setAvailable(true);
		}
	}
	
	// Coding Process 3번  // 메소드 오버라이딩 정의는 Vehicle.java 내부 클래스 정의 
	public void sortByModelName() {
			Collections.sort(VehicleList);
			
	}
	
	// Coding Process 4번 
	// New - For를 이용한 출력
	public void displayVehicles1(String title) {
		System.out.println(title);
		for(Vehicle vl : VehicleList) {
			vl.displayInfo();
			vl.setAvailable(true);
		}
		System.out.println();
	}
	
	// Coding Process 5번 
	// While - Iterator 를 이용한 출력 
	public void displayVehicles2(String title) {
		Iterator itr = VehicleList.iterator();
		
		System.out.println(title);
		while(itr.hasNext()) {
			Vehicle vl = (Vehicle) itr.next();
			vl.displayInfo();
			vl.setAvailable(true);
		}
		
		System.out.println();
	}
}

