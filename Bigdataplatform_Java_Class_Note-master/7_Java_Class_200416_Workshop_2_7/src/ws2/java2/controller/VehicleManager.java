package ws2.java2.controller;

import java.util.Arrays;

import ws2.java2.entity.*;

public class VehicleManager{
	Vehicle[] vehicleList; // 클래스 배열 선언 
	
	public VehicleManager() {
		// 객체 배열 선언 및 초기화 
		vehicleList = new Vehicle[7];
		
		// 오브젝트 타입 캐스팅 / 부모 타입 - 자식 오브젝트 
		vehicleList[0] = new Airplane("Boing - 747", 1300, 300, 4);
		vehicleList[1] = new Airplane("F-16", 1600, 1, 1);
				
		vehicleList[2] = new Car("Sonata - 3", 180, 5, 10);
		vehicleList[3] = new Car("Tico", 130, 4, 15);
		vehicleList[4] = new Car("Starex", 150, 10, 11);
		
		vehicleList[5] = new Ship("Cruse2", 30, 400, 35000);
		vehicleList[6] = new Ship("Notilus", 25, 150, 15000);
	}
	
	
	//Sort 메소드 // Ascending 
	// double For
//	public void sortByModelName() {
//		int iTemp = 0;
//		
//		for(int i = 0; i<vehicleList.length; i++) {
//			for(int j = i+1; j<vehicleList.length; j++) {
//				if(vehicleList[i].getMaxSpeed() > vehicleList[j].getMaxSpeed()) {
//					iTemp = vehicleList[j].getMaxSpeed();
//					vehicleList[j].setMaxSpeed(vehicleList[i].getMaxSpeed());
//					vehicleList[i].setMaxSpeed(iTemp);										
//				}
//			}
//		}
//	}
	
	// Vehicle Class내의 CompareTo(implement)로 구현한 메소드.
	public void sortByModelName2() {
		Arrays.sort(vehicleList);
	}
	
	
	// display함수 구현 및 결과 출력.
	public void displayVehicles(String title) {
		System.out.println(title);
		
		for (int inx = 0 ; inx < vehicleList.length ; inx++) {
			vehicleList[inx].displayInfo();
			vehicleList[inx].setAvailable(true);
		}		
		System.out.println();
	}	
}

