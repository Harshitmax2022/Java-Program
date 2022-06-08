package question1;

public class Account {

	   String accountNumber;
	   
	  double balance;
	  
	
	  public void deposit(int amount) {
		  this.balance= amount;
	  }
	  
	  public double withdraw(int amount) throws InsufficientFundsException {
	
		  if(amount<=balance) {
			  balance= balance-amount;
			  return amount;
		  }
		  else {
			  
			  InsufficientFundsException er= new InsufficientFundsException(" you does not have sufficient balance to withdraw");
			  
			  throw er;
		  }
		  
		
	  }
}
