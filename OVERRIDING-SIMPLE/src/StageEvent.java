public class StageEvent extends Event{

 

    int noOfShows;
    int noOfSeatsPerShow;
    public int getNoOfShows() {
        return noOfShows;
    }
    public void setNoOfShows(int noOfShows) {
        this.noOfShows = noOfShows;
    }
    public int getNoOfSeatsPerShow() {
        return noOfSeatsPerShow;
    }
    public void setNoOfSeatsPerShow(int noOfSeatsShow) {
        this.noOfSeatsPerShow = noOfSeatsShow;
    }
    
    StageEvent(String name, String detail, String ownerName, int noOfShows, int noOfSeatsPerShow)
    {
        super(name,detail,ownerName);
        this.noOfShows = noOfShows;
        this.noOfSeatsPerShow = noOfSeatsPerShow;
    }
    
    public double projectedRevenue()
    {
        return noOfSeatsPerShow*50*noOfShows;
    }
    
}