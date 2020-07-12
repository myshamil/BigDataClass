package ws2.java2.entity;

public class Vehicle {
	
	// Airplane, Car, Ship에서의 공통 멤버 변수 선언
	private String modelName;
	private int maxSpeed;
	private int numberLimit;
	private int special; // Air, Car, Ship 별 독특한 변수는 Special로 묶음. 
	private boolean available;
	
	
	// Default Constructor with 4 variable
	public Vehicle(String modelName, int maxSpeed, int numberLimit, int special) {
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
		this.numberLimit = numberLimit;
		this.special = special;
	};
	
	// Getter & Setter 
	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getNumberLimit() {
		return numberLimit;
	}

	public void setNumberLimit(int numberLimit) {
		this.numberLimit = numberLimit;
	}

	public int getNumOfEngine() {
		return special;
	}

	public void setNumOfEngine(int numOfEngine) {
		this.special = numOfEngine;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	// 메소드 정의 / 이후 자식 클래스에서 구현 
	public void displayInfo() {
		System.out.println("------------------------------------");
		System.out.println("모델명 : " + modelName);
		System.out.println("최고속도 : " + maxSpeed);
		System.out.println("최대정원 : " + numberLimit);
	}
}
