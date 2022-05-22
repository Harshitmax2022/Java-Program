package question3;

public class Account {

	//private information
private	 int	accountId ;
private	 String	accountType ;
private	 int  balance ;

//geter and seter method are here
public int getAccountId() {
	return accountId;
}
public void setAccountId(int accountId) {
	this.accountId = accountId;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
	//empty constructor
Account(){
	
	}

	//method to check is in your account you have sufficient balance ? if yes then print remaining after 
//withdraw and if not then print "sorry";
	public boolean withdraw(int recive) {
		int balance=getBalance();
		if(balance>=recive) {
			balance=balance-recive;
			System.out.println("Balance amount after withdraw :"+balance);
			return true;
		}
		else {
			System.out.println("Sorry!!! No enough balance");
			return false;
		}
		
	}
	
}
