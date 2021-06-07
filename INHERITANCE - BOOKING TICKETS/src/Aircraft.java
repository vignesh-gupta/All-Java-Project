
public class Aircraft {
	protected String aircraftName;
	protected String source;
	protected String destination;
	
	public String getAircraftName() {
		return aircraftName;
	}
	public void setAircraftName(String aircraftName) {
		this.aircraftName = aircraftName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	
	public Aircraft(String aircraftName,String source,String destination){
		this.aircraftName = aircraftName;
		this.source = source;
		this.destination = destination;
	}
	
	public void displayDetails(){
		System.out.println("Aircraft Name : "+aircraftName);
		System.out.println("Source : "+source);
		System.out.println("Destination : "+destination);
	}		
}
