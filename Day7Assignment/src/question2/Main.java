package question2;

public class Main {

	
	public static void main(String[] args) {

		
	  Hosteller hosteller= new Hosteller(60000);
	  
     DayScholar dayScholar= new DayScholar(4000);
     
     double hostRemainFee= hosteller.payFee(hosteller.getHostelFee(), 40000);
     
     double dayRemainfee= dayScholar.payFee(dayScholar.getTransportFee(),6000);
     
     
         System.out.println("Hosteleller Remaining Fee :"+hostRemainFee);
         
         System.out.println("DayScholar Remaining Fee: "+dayRemainfee);
	  
	
		
		
	}
}
