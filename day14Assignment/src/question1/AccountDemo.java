package question1;

public class AccountDemo {

	
	public static void main(String[] args) {
		
		Account account = new Account();
		
		account.accountNumber= "SBI24001233";
		
		    account.deposit(9000);
		
		try {
		  double amount_WithDraw=account.withdraw(5000);
		  System.out.println("amount"+amount_WithDraw);	
		} catch (InsufficientFundsException e) {
		
			System.out.println(e.getMessage());
		}
		
		System.out.println("End of the Statement");
	}
}
