package ws3.java2.driver;

import ws3.java2.controller.*;

public class VehicleDriver {
	public static void main(String[] args) {
		VehicleManager vm = new VehicleManager();
		vm.displayVehicles(">> Item List <<");
		System.out.println('\n');
		
		vm.sortByModelName();
		vm.displayVehicles(">> Sorted List <<");
		System.out.println('\n');
		
		vm.displayVehicles1(">> New For Out <<");
		System.out.println('\n');
		
		vm.displayVehicles2(">> While Out <<");
	}
}
