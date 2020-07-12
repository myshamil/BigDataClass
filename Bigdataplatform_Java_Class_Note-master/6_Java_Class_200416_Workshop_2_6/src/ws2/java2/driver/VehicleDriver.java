package ws2.java2.driver;

import ws2.java2.controller.*;

public class VehicleDriver {
	public static void main(String[] args) {
		VehicleManager vm = new VehicleManager();
		vm.displayVehicles(">> Item list<<");
//		vm.sortByModelName();
//		vm.displayVehicles(">> Sort by Model name list <<");
	}
}