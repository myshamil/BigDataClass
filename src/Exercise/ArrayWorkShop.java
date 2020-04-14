package Exercise;

public class ArrayWorkShop {
	static int sN = 1;
	public static void main(String[] args) {
		String[] s1 = new String[] {"A", "B", "A", "C", "C", "D", "E", "F", "A", "D"};
		String[] s2 = new String[] {"D", "B", "A", "B", "C", "A", "E", "F", "A", "D"};
		String[] s3 = new String[] {"E", "D", "D", "A", "C", "B", "E", "E", "A", "D"};
		String[] s4 = new String[] {"C", "B", "A", "E", "D", "D", "E", "F", "A", "D"};
		String[] s5 = new String[] {"A", "B", "D", "C", "C", "D", "E", "E", "A", "D"};	
		
		check(s1);
		check(s2);
		check(s3);
		check(s4);
		check(s5);
		
	}
	
	static void check(String[] s) {
		int count =0;
	
		String[] ans =  new String[] { "D", "B", "D", "C", "C", "D", "A", "E", "A", "D"};
		for(int i = 0; i<10; i++) {
			if (s[i] == ans[i]) {
				count ++;
			}
		}
		System.out.println("The Student[" + (sN++)+"]'s Score is " + count);
	}
}