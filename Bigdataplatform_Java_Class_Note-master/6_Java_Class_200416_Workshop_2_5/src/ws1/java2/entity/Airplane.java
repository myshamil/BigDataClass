package ws1.java2.entity;

public class Airplane {
	private String modelName;
	private int maxSpeed;
	private int numberLimit;
	private int numOfEngine;
	private boolean available;
	
	public Airplane() {};
	// Constructor
	public Airplane(String modelName, int maxSpeed, int numberLimit, int numOfEngine) {
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
		this.numberLimit = numberLimit;
		this.numOfEngine = numOfEngine;
		
	}
	
	// Setter
	public void setModelName(String modelName) {this.modelName = modelName;}	
	public void setMaxSpeed(int maxSpeed) {this.maxSpeed = maxSpeed;}	
	public void setNumberLimit(int numberLimit) {this.numberLimit = numberLimit;}	
	public void setNumofEngine(int numOfEngine) {this.numOfEngine =  numOfEngine;}	
	public void setavailable(boolean available) {this.available = available;}
	
	// Getter
	public String getModelName() {return modelName;}	
	public int getMaxSpeed() {return maxSpeed;}	
	public int getNumberLimit() {return numberLimit;}	
	public int getNumofEngine() {return numOfEngine;}	
	public boolean getavailable() {return available;}
	
	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" Model Name : " + modelName);
		System.out.println(" Max Speed : " + maxSpeed + "km/h");
		System.out.println(" People : " + numberLimit + "people");
		System.out.println(" Eng. Num : " + numOfEngine + "num");
	}
}
