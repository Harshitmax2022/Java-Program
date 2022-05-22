package question3;
import java.util.Scanner;
public class AccountDetails {
 
	// checkBalance i have take just to check ki user kitna balance fill kar rha 
	// if balance is 0 or less than that why we need to invoke the withdrawn account method 
	// so to stop than i used this so that withdrawn method not invoke unnecessary;
	int checkBalance;
	
	//created a account class object here to set the data of Account.java fill
	//here you need to catch like this
	Account account=new Account();
	
	
	//to get the account details of user
	// and the region to use account class kyuki we also need to return data in object format
	
public Account getAccountDetails() {
	Scanner scan =new Scanner(System.in);
	
	
	System.out.println("Enter account id ");
	account.setAccountId(scan.nextInt());
	
	scan.nextLine();
	System.out.println("Enter account type");
	account.setAccountType(scan.nextLine());
	
	// we have give a condition here like if enter balance is less than or equal to 0 then no go futher
	System.out.println("Enter Balance");
	int balance=scan.nextInt();
	if(balance<=0) {
		System.out.println("Balance should be positive");
		this.checkBalance=-1;
		
	}else {
		account.setBalance(balance);
	}
	
	
	return account; 
	}
  
public int getWithDrawAmmount() {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the amount to be withdrawn");
	int wiDraAmm=scan.nextInt();
	
	if(wiDraAmm>0) {
		boolean result= account.withdraw(wiDraAmm);
		if(result==true) {
			return wiDraAmm;
		}
		else {
			return 0;
		}
	}
	else {
	System.out.println("Amount should be positive");
	return 0;
	}
	
	
	
	
	
}
	public static void main(String[] argus) {
	
		AccountDetails accountDetails=new AccountDetails();
		
		
	Account newData=accountDetails.getAccountDetails();
		
	if(accountDetails.checkBalance<0) {
		System.out.println("");
		System.out.println("please fill data again");
		System.out.println("**********************************");
	}
	else {
		System.out.println("");
		System.out.println("************************************************");
		System.out.println("");
		accountDetails.getWithDrawAmmount();
	}
		
		
		
		
		
		
}
}
