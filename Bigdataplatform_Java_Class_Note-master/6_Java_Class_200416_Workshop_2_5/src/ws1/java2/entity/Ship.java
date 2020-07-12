package ws1.java2.entity;

public class Ship {
	private String modelName;
	private int maxSpeed;
	private int numberLimit;
	private int replacement;
	private boolean available;
	
	
	public Ship() {};
	// Constructor
	public Ship(String modelName, int maxSpeed, int numberLimit, int replacement) {
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
		this.numberLimit = numberLimit;
		this.replacement = replacement;
		
	}
	
	// Setter
	public void setModelName(String modelName) {this.modelName = modelName;}	
	public void setMaxSpeed(int maxSpeed) {this.maxSpeed = maxSpeed;}	
	public void setNumberLimit(int numberLimit) {this.numberLimit = numberLimit;}	
	public void setreplacement(int replacement) {this.replacement =  replacement;}	
	public void setavailable(boolean available) {this.available = available;}
	
	// Getter
	public String getModelName() {return modelName;}	
	public int getMaxSpeed() {return maxSpeed;}	
	public int getNumberLimit() {return numberLimit;}	
	public int getreplacement() {return replacement;}	
	public boolean available() {return available;}
	
	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" Model Name : " + modelName);
		System.out.println(" Max Speed : " + maxSpeed + "km/h");
		System.out.println(" people : " + numberLimit + "people");
		System.out.println(" Watering out : " + replacement + "t");
	}
}
