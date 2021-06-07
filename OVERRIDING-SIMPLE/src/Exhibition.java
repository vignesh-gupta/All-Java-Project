public class Exhibition extends Event{

 

    int noOfStalls;

 

    public int getNoOfStalls() {
        return noOfStalls;
    }

 

    public void setNoOfStalls(int noOfStalls) {
        this.noOfStalls = noOfStalls;
    }
    
    Exhibition(String name , String detail, String ownerName , int noOfStalls)
    {
        super(name , detail , ownerName);
        this.noOfStalls = noOfStalls;
    }
    
    public double projectedRevenue()
    {
        return noOfStalls*10000;
    }
    
    
}