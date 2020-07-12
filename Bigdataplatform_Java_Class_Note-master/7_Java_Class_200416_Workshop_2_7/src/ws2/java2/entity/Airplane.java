package ws2.java2.entity;

public class Airplane extends Vehicle{
	
	private int numOfEngine;
		
	
	// Constructor with 4 variable 
	public Airplane(String modelName, int maxSpeed, int numberlimit, int special) {
		super(modelName, maxSpeed, numberlimit, special);
	}
	
	public void setnumOfEngine(int numOfEngine) {
		this.numOfEngine = numOfEngine;
	}
	public int getnumOfEngine() {
		return numOfEngine;
	}
	
	// 메소드 오버라이딩 구현. 
	public void displayInfo() {
		super.displayInfo();
		System.out.println("엔진 갯수  : " + numOfEngine);

	}
}
