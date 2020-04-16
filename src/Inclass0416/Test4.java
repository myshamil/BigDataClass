package Inclass0416;
interface Ishape{
	void draw (int x, int y);
}
class Circle implements Ishape{
	public void draw(int a, int b) {
		System.out.println("Draw a Circle: "+ a +", "+b);
	}
}
class DrawManager{
	Ishape s;
	public DrawManager(Ishape s) {
		this.s = s;
	}
	public void draw(int s, int t) {
		this.s.draw(s, t);
	}
}

public class Test4 {

	public static void main(String[] args) {
		

	}

}
