package question3;

import java.util.Scanner;

public class IPL {

	 void homeTeamStadium(Stadium stadium) {
		 
		 switch (stadium) {
		case EDEN_GARDENS_STADIUM: {
			System.out.println("This is the home ground of KKR");
			break;
		}
		case WANKHEDE_STADIUM:{
			System.out.println("This is the home ground of Mumbai Indians");
			break;
		}
		case CHIDAMBARAM_STADIUM:{
			System.out.println("This is the home ground of CSK");
			break;
		}
		case M_CHINNASWAMY_STADIUM:{
			System.out.println("This is the home ground of RCB");
			break;
		}

		default:
			throw new IllegalArgumentException("Unexpected value: "+stadium);
			
		}
		 
	 }

	 
	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Stadium Name");
		 String stad= sc.nextLine();
		 
	   Stadium stadium = Stadium.valueOf(stad);
	   
	   IPL ipl = new IPL();
	   ipl.homeTeamStadium(stadium);
		 
	}
	
	
}
