package ws3.java2.driver;

import ws3.java2.controller.*;

public class VehicleDriver {
	public static void main(String[] args) {
		VehicleManager vm = new VehicleManager();
		vm.displayVehicles1(">> ��� ��� <<");
		vm.sortByMaxSpeed();
		vm.displayVehicles1(">> �𵨸����� ���ĵ� ��� ��� <<");
		System.out.println("2");
		vm.displayVehicles2();
	}
}
