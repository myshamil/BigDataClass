package ws3.java2.controller;

import ws3.java2.entity.*;
import java.util.*;

public class VehicleManager {
	//�Ʒ� �ڵ�� �迭�� �����ϴ� ������ ������ ���̴�.
	//ArrayList�� �����ϵ��� ���ο� ������ �����Ͻÿ�.(��������  vehicleList)
//	Vehicle[] vehicleArr;
	ArrayList<Vehicle> vehicleList;
	
	public VehicleManager() {
		//�Ʒ� �ڵ�� �迭�� �̿��ϵ��� �ۼ��Ǿ���.
		//ArrayList�� ����ϵ��� �����Ͻÿ�.
		vehicleList = new ArrayList<>();
		vehicleList.add(new Airplane("����747", 1300, 300, 4));
		vehicleList.add(new Airplane("F-16", 1600, 1, 1));
		vehicleList.add(new Car("�ҳ�Ÿ3", 180, 5, 10));
		vehicleList.add(new Car("Ƽ��", 130, 4, 15));
		vehicleList.add(new Ship("ũ����2", 30, 400, 35000));
		vehicleList.add(new Ship("��ƿ����", 25, 150, 15000));		
	}

		
	public void displayVehicles1(String title) {
		//�Ʒ� �ڵ�� �迭�� ����Ű�� ��� ��ü�� ������ ����ϵ��� �ۼ��Ǿ���.
		//ArrayList�� vehicleList�� ��� ��� ��ü�� ����ϵ��� �����Ͻÿ�.		
		System.out.println(title);	    
	     for(Vehicle v : vehicleList) {
	        v.displayInfo();
	        v.setAvailable(true);
	      }
		System.out.println();		
	}
	 public void displayVehicles2() {
	    Iterator<Vehicle> veh = vehicleList.iterator();
	    while (veh.hasNext()) {
	    	Vehicle vv = veh.next()	;
	    	vv.displayInfo();
	    	vv.setAvailable(true);
	    }    
	 } 
	public void sortByMaxSpeed() {
		//�Ʒ� �ڵ�� �迭�� ���ؼ� ������ �����ϴ� ���̴�.
		//ArrayList�� vehicleList�� ���ؼ� ������ �����ϴ� �ڵ�� ��ȯ�Ͻÿ�.
		Collections.sort(vehicleList);			
	}
}

