package Inclass0416;
interface IAnimal{
	void breath();
	
}
abstract class IDog implements IAnimal{
	public abstract void breath();
}
class ADog extends IDog{
	public void breath() {
		System.out.println("ADog breath");
	}
}
public class Test7 {
public static void main(String[] args) {
	IAnimal a = new ADog();
	a.breath();
}
}
