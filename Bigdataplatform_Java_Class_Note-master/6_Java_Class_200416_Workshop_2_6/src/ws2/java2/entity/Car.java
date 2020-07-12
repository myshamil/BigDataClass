package ws2.java2.entity;

public class Car extends Vehicle{
	
	private int mileage;
	
	// Constructor with 4 variable 
	public Car(String modelName, int maxSpeed, int numberlimit, int special) {
		super(modelName, maxSpeed, numberlimit, special);
	}
	
	public void setmileage(int mileage) {
		this.mileage = mileage;
	}
	public int getmileage() {
		return mileage;
	}
	
	// 메소드 오버라이딩 구현. 
	public void displayInfo() {
		super.displayInfo();
		System.out.println("연비  : " + mileage);
	}
}
