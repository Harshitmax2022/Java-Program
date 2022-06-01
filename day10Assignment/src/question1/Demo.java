package question1;

import java.util.Scanner;

public class Demo {

	
	
	public Hotel provideFood(int amount) {
		
		if(amount>1000) {
		   
			TajHotel tajHotel= new TajHotel();
			return tajHotel;
			
		}
		else if(amount>200 && amount <1000) {
			
			RoadSideHotel roadSideHotel = new RoadSideHotel();
			
			return roadSideHotel;
		}
		else {
			return null;
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount");
		int amount= sc.nextInt();
		 
		while(amount<=200) {
			System.out.println("Please Enter valid amount");
			
			System.out.println("Enter the Amount");
			 amount= sc.nextInt();
		}
		
	  Demo demo = new Demo();
	  
	   Hotel hotel= demo.provideFood(amount);
	     
	   if(hotel instanceof TajHotel) {
		   
		   System.out.println("================================================");
		   ((TajHotel)hotel).welcomeDrink();
		   
		   hotel.chickenBiryani();
		   hotel.masalaDosa();
	   }
	   else {
		   System.out.println("================================================");
		   hotel.chickenBiryani();
		   hotel.masalaDosa();
	   }
		
		
	}
}
