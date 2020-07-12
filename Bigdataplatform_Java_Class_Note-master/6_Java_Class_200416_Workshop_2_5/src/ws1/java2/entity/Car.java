package ws1.java2.entity;

public class Car {
	private String modelName;
	private int maxSpeed;
	private int numberLimit;
	private int mileage;
	private boolean available;
	
	
	public Car() {};
	// Constructor 
	public Car(String modelName, int maxSpeed, int numberLimit, int mileage) {
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
		this.numberLimit = numberLimit;
		this.mileage = mileage;
	}
	
	//Setter
	public void setModelName(String modelName) {this.modelName = modelName;}	
	public void setMaxSpeed(int maxSpeed) {this.maxSpeed = maxSpeed;}	
	public void setNumberLimit(int numberLimit) {this.numberLimit = numberLimit;}	
	public void setmileage(int mileage) {this.mileage =  mileage;}	
	public void setavailable(boolean available) {this.available = available;}
	
	// Getter
	public String getModelName() {return modelName;}	
	public int getMaxSpeed() {return maxSpeed;}	
	public int getNumberLimit() {return numberLimit;}	
	public int getmileage() {return mileage;}	
	public boolean available() {return available;}
	
	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" Model Name : " + modelName);
		System.out.println(" Max Speed : " + maxSpeed + "km/h");
		System.out.println(" People : " + numberLimit + "people");
		System.out.println(" Avg Rate : " + mileage + "km/l");
	}
}
