public class StageEvent extends Event{

 

    private double costPerShow;
    private int noOfShows;
    public StageEvent(String name ,String detail ,  String type ,String organiser,int noOfShows,  double costPerShow )
    {
        super(name,detail, type, organiser);
        this.noOfShows = noOfShows;
        this.costPerShow = costPerShow;
    }
    public void setName(String n)
    {
        name = n;
    }
    public String getName()
    {
        return name;
    }
    
    public void setType(String n)
    {
        type = n;
    }
    public String getType()
    {
        return type;
    }
    
    public void setCostPerShow(double n)
    {
        costPerShow = n;
    }
    public double getCostPerShow()
    {
        return costPerShow;
    }
    
    
    public void setNoOfShows(int n)
    {
        noOfShows = n;
    }
    public int getNoOfShows()
    {
        return noOfShows;
    }
    
    public void setDetail(String n)
    {
        detail = n;
    }
    public String getDetail()
    {
        return detail;
    }
    
    public void setOrganiser(String n)
    {
        organiser = n;
    }
    public String getOrganiser()
    {
        return organiser;
    }
    
    double calculateAmount()
    {
        return (noOfShows * costPerShow);
    }
}