import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Ticket t1= new Ticket();
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter no of bookings");
	     int bookings = sc.nextInt();
	     
	     System.out.println("Enter the available tickets");
	     Ticket.availableTickets = sc.nextInt();
	     
	     System.out.println("Enter the ticket-id");
	     t1.ticketid = sc.nextInt();
	     
	     System.out.println("Enter the price");
	     t1.price = sc.nextInt();
	     
	     System.out.println("no of Available tickets:"+Ticket.availableTickets);
	     
	     
	     
	     for(int i=0;i<bookings;i++) {
	    	 System.out.println("Enter the no of tickets");
		     int nOfT = sc.nextInt();
		     System.out.println("Total amount  :"+t1.calculateTicketCost(nOfT));
		     System.out.println( "Available ticket after booking  :"+Ticket.availableTickets);
	     }
	     
	     
	     sc.close();
	}
}

