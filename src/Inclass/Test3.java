package Inclass;
class MyClass{
	String m;
	void mMethod() {}
}
public class Test3 {
	public static void main(String[] args) {
		int[] arr;
		arr = new int[3]; 
		//위 두줄을 합쳐서 아래 처럼 한 줄에 쓸 수 있음 ! 
		int[] arr2 = new int[3];
		arr2[0]=1;
		arr2[1]=2;
		arr2[2]=3;
		
		for(int inx = 0; inx < arr2.length; inx++) {
			System.out.println(arr2[inx]);
		}
		MyClass[] arr3;
		arr3 = new MyClass[3];
		//어레이를 만든거라 널값이 되어버린다. 
		arr3[0]=new MyClass();
		arr3[1]= new MyClass();
		arr3[2]= new MyClass(); //그래서 값을 넣어줌 
		arr3[0].m="안녕해";
		System.out.println(arr3[0].m);
	}
}
