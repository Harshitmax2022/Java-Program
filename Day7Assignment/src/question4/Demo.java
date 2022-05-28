package question4;

import java.util.Scanner;

public class Demo {

	
	public static Bank getBank(String ba) {

		System.out.println("bank "+ba);
		if(ba.equals("Axis")) {
        
			
			AxisBank axisBank = new AxisBank();
			axisBank.branchName="companyBag";
			axisBank.IfscCode="AXIS3243";
			axisBank.rateOfInterest=5;
			return axisBank ;
			
		}
		else if(ba.equals("ICICI")) {
			
			ICICIBank iciciBank=new ICICIBank();
			iciciBank.branchName="Badsah Nagar";
			iciciBank.IfscCode="ICICI4324";
			iciciBank.rateOfInterest=10;
			return iciciBank ;
		}
		else {
			return null;
		}
		
	}
	public static void main(String[] args) {
		
	
		
	
		
		
		
		
		
		try (Scanner scan = new Scanner(System.in)) {
			
			   
			System.out.println("Enter the Bank Name");
			String name=scan.next();
			
			  Bank bank= Demo.getBank(name);
			  
			  if(bank instanceof ICICIBank) {
				  System.out.println("Displaying the details of ICICIBank ACCOUNT HOLDER");
				  System.out.println("                                         ");
				  
				  bank.displayDetails();
			  }
			  else if(bank instanceof AxisBank) {
				  System.out.println("Displaying the details of AxisBank  ACCOUNT HOLDER");
				  System.out.println("                                 ");
				  bank.displayDetails();
				  
				    ((AxisBank)bank).getCreditCard();
				 
			  }
			  else {
				  System.out.println("PLease Fill the right Bank Name");
				  
			  }
		}
		
		
	}
	
	
}
