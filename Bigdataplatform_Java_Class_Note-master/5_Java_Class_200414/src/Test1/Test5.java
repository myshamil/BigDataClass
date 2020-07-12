package Test1;

class Boxx  extends Object{ 
   private String conts;
   
   Boxx(String cont) {
      this.conts =cont;
   }
   public String toString() {  //이 부분이 없으면 값이 주소로 산출된다.  메인함수 바로 위에 static void println2(Object O) {
      return conts;         //                                 System.out.println(o.toString());
                        //                              이렇게 써도 같은 결과
   }
}

class Test5 {

   public static void main(String[] args) {
      Boxx[] ar = new Boxx[3];
      
      ar[0] = new Boxx("First");
      ar[1] = new Boxx("Second");
      ar[2] = new Boxx("Thirs"); //생성만 하는 것
   
      System.out.println(ar[0]);
      System.out.println(ar[1]);
      System.out.println(ar[2]);
      
      String[] arr = {"1","2","3"}; //생성과 초기화 같이 하는 것
      System.out.println(arr[0]);
      Object o = new Object();
      
   }

}