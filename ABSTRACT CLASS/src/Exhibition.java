public class Exhibition extends Event {

 

    private int noOfStalls;
    private double rentPerStall;
    
    public Exhibition(String name, String detail ,String type, String organiser, int noOfStalls, double rentPerStall)
    {
        super(name , detail , type , organiser);
        this.noOfStalls = noOfStalls;
        this.rentPerStall = rentPerStall;
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
    
    public void setRentPerStall(double n)
    {
        rentPerStall = n;
    }
    public double getRentPerStall()
    {
        return rentPerStall;
    }
    
    
    public void setNoOfStalls(int n)
    {
        noOfStalls = n;
    }
    public int getNoOfStalls()
    {
        return noOfStalls;
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
        return (noOfStalls * rentPerStall);
    }
}