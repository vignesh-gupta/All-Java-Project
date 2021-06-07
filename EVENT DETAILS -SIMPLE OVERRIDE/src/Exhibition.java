public class Exhibition extends Event
{
    
    private int stallCount;

 

    public int getStallCount() {
        return stallCount;
    }

 

    public void setStallCount(int stallCount) {
        this.stallCount = stallCount;
    }
    
    public Exhibition(String name, String detail, String organizer, int stallCount)
    {
        super(name,detail,organizer);
        setStallCount(stallCount);
    }
    
    public String toString()
    {
        return super.toString() + "\nStall Count : " + getStallCount();
    }
    
    public void totalCredit()
    {
        int totalCredit=getStallCount()*50;
        System.out.println("\nCredit Details");
        System.out.println("Total Credit Gained is " + totalCredit);
    }

 

}