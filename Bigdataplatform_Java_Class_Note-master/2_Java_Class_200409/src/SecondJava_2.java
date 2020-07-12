import java.util.Scanner;

public class SecondJava_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 2;
		int c = (a > b) ? a : b;
		System.out.println(c);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input : ");
		int num = scanner.nextInt();
//		switch(num) {
//		case 10:
//			System.out.println("It's ten");
//			break;
//		
//		case 20:
//		
//			System.out.println("Not ten");
//			break;
//			
//		default:
//			System.out.println("another");
//		}
		
		if(num == 10) {
			System.out.println("It's ten");
		}
		else if(num == 20) {
			System.out.println("Not ten");
		}
		else {
			System.out.println("another");
		}
		
	}
}
