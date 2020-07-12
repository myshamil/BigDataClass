/*
 * Workshop #2-1
다음 실행코드는 은행의 계좌클래스(Account)에서 객체를 생성하고 돈을 입금 및 출금한 내용이다. 
그리고 각각의 메서드를 사용해서 필요한 작업을 했다. 
각 메서드들을 보고 원본 클래스를 정의하여보라(반드시 접근제한자를 포함해야 한다. 
interest를 제외한모든 멤버변수Encapsulation을 적용하여라.)
 */

package Workshop_2_1;

class Account{
	private String strAccount;
	private String strName;
	private double iMoney;
	static double interest;
	
	public Account(String account, String name, int cost) {
		strAccount = account;
		strName = name;
		iMoney = cost;
	}
	
	public void deposit(int cost) {iMoney += cost;}
	public void withdraw(int cost) {iMoney -= cost;}
	public void addInterest() {iMoney = iMoney + iMoney*interest;}
	public String getAccountName() {return strName;}
	public String getAccountNo() {return strAccount;}
	public double getBalance() {return iMoney;}
}

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account customer1 = new Account("111-222-3333333", "KSM", 20000);
		Account customer2 = new Account("555-666-7777777", "MSK", 100000);
		System.out.println("기본 적립금 ");
		printAccount(customer1);
		printAccount(customer2);
		
		System.out.println("한번의 입출금 ");
		customer1.deposit(1000000);
		customer2.withdraw(30000);
		printAccount(customer1);
		printAccount(customer2);
		
		System.out.println("이자율의 계산 ");
		Account.interest = 0.05;
		customer1.addInterest();
		customer2.addInterest();
		printAccount(customer1);
		printAccount(customer2);
		
	}

		static void printAccount(Account customer) {
			System.out.println("계좌번호 : " + customer.getAccountNo());
			System.out.println("예금주 이름 : " + customer.getAccountName());
			System.out.println("잔액 : " + customer.getBalance());
			System.out.println();
		}
}
