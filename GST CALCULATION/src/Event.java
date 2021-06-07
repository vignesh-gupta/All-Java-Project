class Event{
    protected String name;
    protected String type;
    protected double costPerDay;
    protected int noOfDays;
    
    public Event(String name, String type, double costPerDay, int noOfDays){
    	this.name=name;
    	this.type=type;
    	this.costPerDay=costPerDay;
    	this.noOfDays=noOfDays;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
}