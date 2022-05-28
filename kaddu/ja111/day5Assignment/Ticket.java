package day5Assignment;

public class Ticket {
  
	private int ticketid;
	private int price;
	 static int availableTickets;
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvailableTickets() {
		return availableTickets;
	}
	
	public static void setAvailableTickets(int availableTickets) {
		
		if(availableTickets>0) {
			Ticket.availableTickets = availableTickets;
		}
		
	}
	public int calculateTicketCost(int nooftickets) {
		int avaTicket= getAvailableTickets();
		
		if(avaTicket>=nooftickets) {
		    avaTicket=avaTicket-nooftickets;
		    setAvailableTickets(avaTicket);
		    int checkPrice=getPrice();
		    return checkPrice*nooftickets;
		}
		else {
			return -1;
		}
		
		
	}
}
