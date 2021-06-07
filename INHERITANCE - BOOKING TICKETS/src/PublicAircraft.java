import java.text.DecimalFormat;

public class PublicAircraft extends Aircraft{
	boolean	checkInBeforeTwoHours=true;


	int	noOfKgsAllowed;
	double	additionalFeePerkg;
	
	
	public PublicAircraft(String aircraftName, String source, String destination, boolean checkInBeforeTwoHours ,int noOfKgsAllowed, double additionalFeePerkg) {
		super(aircraftName, source, destination);
		// TODO Auto-generated constructor stub
		this.noOfKgsAllowed=noOfKgsAllowed;
		this.additionalFeePerkg=additionalFeePerkg;
		this.checkInBeforeTwoHours=checkInBeforeTwoHours;
	}

	public int getNoOfKgsAllowed() {
		return noOfKgsAllowed;
	}

	public void setNoOfKgsAllowed(int noOfKgsAllowed) {
		this.noOfKgsAllowed = noOfKgsAllowed;
	}

	public double getAdditionalFeePerkg() {
		return additionalFeePerkg;
	}

	public void setAdditionalFeePerkg(double additionalFeePerkg) {
		this.additionalFeePerkg = additionalFeePerkg;
	}
	
	public boolean isCheckInBeforeTwoHours() {
		return checkInBeforeTwoHours;
	}

	public void setCheckInBeforeTwoHours(boolean checkInBeforeTwoHours) {
		this.checkInBeforeTwoHours = checkInBeforeTwoHours;
	}
	 public void displayDetails()
	    {
	        System.out.println("Flight Details :");
	        System.out.println("Public Aircraft:");
	        super.displayDetails();
	        if(isCheckInBeforeTwoHours()==true)
	        {
	        	System.out.println("Flight check in before two hours : Yes");
	        	System.out.println("Number of kgs allowed per person : " + getNoOfKgsAllowed());
	        	DecimalFormat df=new DecimalFormat("0.00");
	        	System.out.println("Additional fee charged for extra baggage per Kg : " + df.format(getAdditionalFeePerkg()));
	        }
	    }
}