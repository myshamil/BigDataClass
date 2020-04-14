package Inclass;

public class Test5 {
	public static void main(String[] args) {
		int[]	arr = new int[3];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		for (int inx = 0; inx < arr.length; inx++) {
			System.out.println(arr[inx]);
		}//위 두줄을 아래 처럼 줄일 수 있다 
		for(int a :arr) {
			System.out.println(a);
		}
		String[]	strs = {"이순신", "홍길동", "신사임당"};
		for(String nm : strs) {
			System.out.println(nm);
		}
	}
}
