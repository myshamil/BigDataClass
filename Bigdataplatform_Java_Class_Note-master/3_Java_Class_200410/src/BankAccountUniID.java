
class BankAccount{
	String accNumber;
	String ssNumber;
	int balance = 0;
	
	public void initAccount(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	}
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	
	public int checkMyBalance() {
		System.out.println("계좌번호 : " + accNumber);
		System.out.println("주민번호 : " + ssNumber);
		System.out.println("잔 액 : " + balance + '\n');
		return balance;
		
	}
}


public class BankAccountUniID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount yoon = new BankAccount();
		yoon.initAccount("1234", "1111-1111", 10000);
		
		BankAccount park = new BankAccount();
		park.initAccount("4321","2222-1111", 20000);
		
		yoon.deposit(5000);
		park.deposit(3000);
		
		yoon.withdraw(1000);
		park.withdraw(2000);
		
		yoon.checkMyBalance();
		park.checkMyBalance();
	}

}
