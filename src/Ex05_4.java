
public class Ex05_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//문제1 : 1부터 99까지의 합을 while문으로
		int a = 1;
		int s = 0;
		while(a <= 99) {
			s += a;
			a++;
		}
		System.out.println(s);
		
//문제2 : 1~100까지출력 거꾸로 100~1출력, while, do~while 한 번 씩 사용.
		int a2 = 1;
		while (a2<=100) {
			System.out.println(a2);
			a2++;
		}
		
		
	}

}
