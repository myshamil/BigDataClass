package ws2.java2.entity;

public class Ship extends Vehicle{
	
	private int replacement;
	
	// Constructor with 4 variable 
	public Ship(String modelName, int maxSpeed, int numberlimit, int special) {
		super(modelName, maxSpeed, numberlimit, special);
	}
	
	public void setReplacement(int replacement) {
		this.replacement = replacement;
	}
	public int getReplacement() {
		return replacement;
	}
	
	// 메소드 오버라이딩 구현. 
	public void displayInfo() {
		super.displayInfo();	
		System.out.println("배수량  : " + replacement);
	}
}
