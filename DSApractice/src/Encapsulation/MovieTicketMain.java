package Encapsulation;

public class MovieTicketMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieTicket MT = new MovieTicket();
		MT.setPrice(250);
		MT.setNumberOfTickets(5);
		MT.setMovieName("TOXIC");
		System.out.println("Number of tickets: " +MT.getNumberOfTickets()+"\nEach ticket Price: "+MT.getPrice()+"\nMovie Name: "+MT.getMovieName());
	}

}
