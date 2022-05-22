package question2;

import java.util.Scanner;
public class Main {

	
	public static void main(String[] argus) {
		
		Ticket ticket=new Ticket();
		
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("ente no of booking");
		 int noTick = scan.nextInt();
		 
		 System.out.println("enter the available tickets");
			int avTick=scan.nextInt();
			
		 System.out.println("enter the ticketID");
			int tickId=scan.nextInt();
		  ticket.setTicketid(tickId);
			
			
			System.out.println("enter the price");
			int tickPrice=scan.nextInt();
			ticket.setPrice(tickPrice);
			
			
		 ticket.setAvailableTickets(avTick);
		 
	int total=ticket.calculateTicketCost(noTick);
		 
		
		
		
		System.out.println();
	
		System.out.println("**********************************************************");
		
		System.out.println("Total :"+total);
		
		int remTick= ticket.getAvailableTickets();
		System.out.println("Available ticket after booking:"+remTick);
		}
	
	  
}
