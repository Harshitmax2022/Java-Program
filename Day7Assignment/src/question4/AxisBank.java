package question4;

public class AxisBank  extends Bank{
       
	
 double	rateOfInterest;
 
 
 
   @Override
   void displayDetails(){
		 System.out.println("Bank Name :"+this.branchName);
		 System.out.println("IFSCcode:"+this.IfscCode);
		 System.out.println("RateOfInterest :"+this.rateOfInterest+"%");
	 }
	
 void  getCreditCard(){
	 System.out.println("“Get the Credit Card from the Axis bank");  
   }
}
