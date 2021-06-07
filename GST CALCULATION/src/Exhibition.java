import java.text.DecimalFormat;

class Exhibition extends Event {
	private static int	gst = 5;
	private int	noOfStalls;
	
	public Exhibition(String name, String type, double costPerDay, int noOfDays , int noOfStalls) {
		super(name, type, costPerDay, noOfDays);
		this.noOfStalls = noOfStalls;
		// TODO Auto-generated constructor stub
	}
	
	public int getNoOfStalls() {
		return noOfStalls;
	}

	public void setNoOfStalls(int noOfStalls) {
		this.noOfStalls = noOfStalls;
	}

	public double totalCost() {

        double total = noOfDays * costPerDay;
        total = total + (total*gst/100);
        return total;
    }    
    
    public String toString(){
    	 DecimalFormat df = new DecimalFormat("0.00");
         String s = "Event Details\nName:" + name +"\nType:" + type +"\nNumber of stalls:"+ noOfStalls + "\nTotal amount:" + df.format(totalCost());
         return s;
    }
}