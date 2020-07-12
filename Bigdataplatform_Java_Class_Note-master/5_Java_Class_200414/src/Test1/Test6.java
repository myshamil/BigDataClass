package Test1;
/*
 * Enhanced for에 대해서 학습한다. 
 */
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		
		// 기존 For문 
		for(int inx = 0; inx<arr.length; inx++) {
			System.out.println(arr[inx]);
		}
		
		// Enhanced-For 
		for(int a : arr) {
			System.out.println(a);
		}
	}

}
