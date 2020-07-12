import java.util.Scanner;

// 문제 1.
// 커피 주문을 하려고 한다.
// 메뉴를 보고, 각 메뉴 별로 몇 개씩 주문할 것인지 입력 받아 지불해야 할 총 금액을 계산해 보자.
// 그리고 총 금액이 일정 금액을 넘어서면 포인트를 적립해 준다.
// 총 금액 12000원 이상 : 구매 금액의 1% 적립
// 총 금액 30000원 이상 : 구매 금액의 2% 적립

class cost{
	public static int iAme = 2000;
	public static int iCfl = 3000;
	public static int iBgl = 1500;
	public static int iCcs = 500;
	
	public static int Calc(int what, int n) {
		return what*n;
	}
}

public class Workshop_1 {
    
    public static void main( String[] args ) {
        
        System.out.println( "========= 메뉴 =========" );
        System.out.println( " 1. 아메리카노   2000원" );
        System.out.println( " 2. 카페라떼   3000원" );
        System.out.println( " 3. 베이글   1500원" );
        System.out.println( " 4. 크림치즈   500원\n" );
        
        System.out.println( "========= 주문 =========" );
        System.out.print( " 아메리카노 주문 수량 : " );    
        int iAmericano = getUserInput();
        
        System.out.print( " 카페라떼 주문 수량 : " );  
        int iCafelatte = getUserInput();
        
        System.out.print( " 베이글 주문 수량 : " );
        int iBagle = getUserInput();
        
        System.out.print( " 크림치즈 주문 수량 : " );
        int iCreamcheese = getUserInput();
        
        int iTotalcost = 0;
        System.out.println( "========= 금액 =========" );
        iTotalcost += cost.Calc(cost.iAme, iAmericano);
        System.out.println( " 아메리카노 : " + cost.Calc(cost.iAme, iAmericano));
        iTotalcost += cost.Calc(cost.iCfl, iCafelatte);
        System.out.println( " 카페라떼 : " + cost.Calc(cost.iCfl, iCafelatte)); 
        iTotalcost += cost.Calc(cost.iBgl, iBagle);
        System.out.println(" 베이글 : " + cost.Calc(cost.iBgl, iBagle));   
        iTotalcost += cost.Calc(cost.iCcs, iCreamcheese);
        System.out.println( " 크림치즈 : " + cost.Calc(cost.iCcs, iCreamcheese));
        
        
        double dPoint = 0;
        System.out.println( "==================" );
        System.out.print( " 총 구매 금액  : " + iTotalcost);
        
        if(iTotalcost > 30000) {
        	dPoint = iTotalcost * 0.02;
        }
        else if(iTotalcost > 12000) {
        	dPoint = iTotalcost * 0.01;
        }
        else
        	dPoint = 0;
        System.out.print( " 포인트 적립  : " + dPoint);

        
    }
    
    public static int getUserInput() {
    	
       Scanner scanner = new Scanner(System.in);
       int value = scanner.nextInt();
       return value;
       
    }
}