class Ticket{
	 int ticketid; 
	 int price; 
	 
	 public int calculateTicketCost(int noOfTickets) {
		 int av=availableTickets;
		 if(availableTickets!=0) {
			 if(noOfTickets<availableTickets) {
				 availableTickets-=noOfTickets;
				 return price*noOfTickets;
			 }
			 availableTickets=0;
			 return price*av;
		 }
		 
		 
		 
		 return -1;
	 }

//getter and setter methods//
	
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
	
	
	
	static int availableTickets= 4;
}