package Encapsulation;

public class MovieTicket {
	
	private int price;
	private int NumberOfTickets;
	private String MovieName;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNumberOfTickets() {
		return NumberOfTickets;
	}
	public void setNumberOfTickets(int numberOfTickets) {
		NumberOfTickets = numberOfTickets;
	}
	public String getMovieName() {
		return MovieName;
	}
	public void setMovieName(String movieName) {
		MovieName = movieName;
	}
	

}
