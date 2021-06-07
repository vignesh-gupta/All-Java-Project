
public class Ticket {
	public static int noOfSeats;
	
	public static int getNoOfSeats() {
		return noOfSeats;
	}
	public static void setNoOfSeats(int noOfSeats) {
		Ticket.noOfSeats = noOfSeats;
	}
	
	static class Platinum{
		
		public static void setNoOfSeats(int noOfSeats) {
			Ticket.noOfSeats = noOfSeats;
		}
		
		public double computeCost(){
			double total = 210.50*noOfSeats;
			return total;
		}
	}
	
	static class Gold{
		
		public static void setNoOfSeats(int noOfSeats) {
			Ticket.noOfSeats = noOfSeats;
		}
		
		public double computeCost(){
			double total = 168.45*noOfSeats;
			return total;
		}
	}

	static class Silver{
		
		public static void setNoOfSeats(int noOfSeats) {
			Ticket.noOfSeats = noOfSeats;
		}
		
		public double computeCost(){
			double total = 107.37*noOfSeats;
			return total;
		}
	}
}
