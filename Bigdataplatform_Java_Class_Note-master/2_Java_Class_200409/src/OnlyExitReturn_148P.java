
public class OnlyExitReturn_148P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		divide(4,2);
		divide(10,3);
		add(3,8);
		
	}
	
		public static void divide(int num1, int num2) {
			if(num2 == 0) {
				System.out.println("Cant calculate");
				return;
			}
			else
				System.out.println("나눗셈 결과 " + num1/num2);
		}
		
		public static void add(int num1, int num2) {
			System.out.println(num1+num2);
		}
		
		

}
