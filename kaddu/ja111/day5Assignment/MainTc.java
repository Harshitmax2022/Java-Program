package day5Assignment;

import java.util.Scanner;


public class MainTc {
   
	
	public static void main() {
		
		Ticket ticket=new Ticket();
		
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("ente no of booking");
		 int noTick = scan.nextInt();
	int total=ticket.calculateTicketCost(noTick);
		 
		 
		System.out.println("enter the available tickets");
		int avTick=scan.nextInt();
	 ticket.setAvailableTickets(avTick);
		
		
		System.out.println("enter the ticketID");
		int tickId=scan.nextInt();
	  ticket.setTicketid(tickId);
		
		
		System.out.println("enter the price");
		int tickPrice=scan.nextInt();
		ticket.setPrice(tickPrice);
		
		System.out.println("Total :"+total);
		
		int remTick= ticket.getAvailableTickets();
		System.out.println("Available ticket after booking:"+remTick);
		}
	
	  
}
