package Inclass;

public class Test5 {
	public static void main(String[] args) {
		int[]	arr = new int[3];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		for (int inx = 0; inx < arr.length; inx++) {
			System.out.println(arr[inx]);
		}//�� ������ �Ʒ� ó�� ���� �� �ִ� 
		for(int a :arr) {
			System.out.println(a);
		}
		String[]	strs = {"�̼���", "ȫ�浿", "�Ż��Ӵ�"};
		for(String nm : strs) {
			System.out.println(nm);
		}
	}
}
