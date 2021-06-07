public class PrivateAircraft extends Aircraft{
	
	private boolean	checkInBeforeTwoHours;
	private String	pilotPreference;
	private String	purpose;
	
	public boolean isCheckInBeforeTwoHours() {
		return checkInBeforeTwoHours;
	}

	public void setCheckInBeforeTwoHours(boolean checkInBeforeTwoHours) {
		this.checkInBeforeTwoHours = checkInBeforeTwoHours;
	}

	public String getPilotPreference() {
		return pilotPreference;
	}

	public void setPilotPreference(String pilotPreference) {
		this.pilotPreference = pilotPreference;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
	public PrivateAircraft(String aircraftName, String source, String destination, boolean checkInBeforeTwoHours, String pilotPreference, String purpose) {
		super(aircraftName, source, destination);
		// TODO Auto-generated constructor stub
		this.checkInBeforeTwoHours = checkInBeforeTwoHours;
		this.pilotPreference = pilotPreference;
		this.purpose=purpose;
	}
	
	 public void displayDetails(){
	        System.out.println("Flight Details :");
	        System.out.println("Private Aircraft:");
	        super.displayDetails();
	        if(isCheckInBeforeTwoHours()==false)
	        {
	        	System.out.println("Flight check in before two hours : No");
	        	System.out.println("Pilot chose : " + getPilotPreference());
	        	System.out.println("Purpose of the flight : "+getPurpose());
	        }
	 }


}
