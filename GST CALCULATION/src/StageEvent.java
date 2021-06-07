import java.text.DecimalFormat;

class StageEvent extends Event{

	private static int	gst = 15;
	private int	noOfSeats;
	
	public StageEvent(String name, String type, Double costPerDay, Integer noOfDays, int noOfSeats) {
		super(name, type, costPerDay, noOfDays);
		this.noOfSeats=noOfSeats;
		// TODO Auto-generated constructor stub
	}
	
	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
	public double totalCost()
	{
        double total = noOfDays * costPerDay;
        total = total + (total*gst/100);
        return total;
	}
	public String toString()
	{
		DecimalFormat df = new DecimalFormat("0.00");
		String s = "Event Details\nName:" + name +"\nType:" + type +"\nNumber of seats:"+ noOfSeats + "\nTotal amount:" + df.format(totalCost());
		return s;
	}
}