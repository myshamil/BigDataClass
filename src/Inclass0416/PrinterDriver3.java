package Inclass0416;
interface Printable1{
	void print(String doc);
}

interface ColorPrintable extends Printable1{
	void printCMYK(String doc);
}

class Prn909Drv implements ColorPrintable{
	@Override
	public void print(String doc) {
		System.out.println("From MD-909 black & white ver");
		System.out.println(doc);
	}
	@Override
	public void printCMYK(String doc) {
		System.out.println("From MD-909 CYMK ver");
		System.out.println(doc);
	}
}


public class PrinterDriver3 {

	public static void main(String[] args) {
		String myDoc ="adfasdfasdfasdf";
		ColorPrintable prnn = new Prn909Drv();
		prnn.print(myDoc);
		System.out.println();
		prnn.printCMYK(myDoc);
	}

}
