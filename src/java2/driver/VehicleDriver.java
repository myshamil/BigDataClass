package ws3.java2.driver;

import ws3.java2.controller.*;

public class VehicleDriver {
	public static void main(String[] args) {
		VehicleManager vm = new VehicleManager();
		vm.displayVehicles1(">> 재고 목록 <<");
		vm.sortByMaxSpeed();
		vm.displayVehicles1(">> 모델명으로 정렬된 재고 목록 <<");
		System.out.println("2");
		vm.displayVehicles2();
	}
}
