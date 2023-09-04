class Airlines{
	String airLineName;
	String flightNumber;
	String departureTime;
	String arrivalTime;
	double ticketPrice;
	
	public Airlines(String airLineName,String flightNumber,String departureTime,String arrivalTime,double ticketPrice){
		this.airLineName=airLineName;
		this.flightNumber=flightNumber;
		this.departureTime=departureTime;
		this.arrivalTime=arrivalTime;
		this.ticketPrice=ticketPrice;
		
		System.out.println("Name of the airline : "+airLineName);
		System.out.println("\nFlight Number  : "+flightNumber);
		System.out.println("\nDeparture Time: "+departureTime);
		System.out.println("\nArrival Time  : "+arrivalTime);
		System.out.println("\nPrice of the ticket : "+ticketPrice);
		System.out.println("\n");
		
		
		
	}
	
	/*public void displayDetails(){
		System.out.println("Name of the airline : "+airLineName);
		System.out.println("\nFlight Number  : "+airLineName);
		System.out.println("\nDeparture Time: "+airLineName);
		System.out.println("\nArrival Time  : "+airLineName);
		System.out.println("\nPrice of the ticket : "+airLineName);
		
	}*/

}