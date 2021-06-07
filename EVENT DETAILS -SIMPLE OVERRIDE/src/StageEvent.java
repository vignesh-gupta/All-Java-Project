public class StageEvent extends Event
{

 

    private int totalShow;
    private int seatsPerShow;
    
    public int getTotalShow() {
        return totalShow;
    }
    public void setTotalShow(int totalShow) {
        this.totalShow = totalShow;
    }
    public int getSeatsPerShow() {
        return seatsPerShow;
    }
    public void setSeatsPerShow(int seatsPerShow) {
        this.seatsPerShow = seatsPerShow;
    }
    
    public StageEvent(String name, String detail, String organizer, int totalShow, int seats)
    {
         super(name,detail,organizer);
         setTotalShow(totalShow);
         setSeatsPerShow(seats);
    }
     
    public String toString()
    {
        return super.toString() + "\nTotal Events : " + getTotalShow() + "\nTotal Seats : " + getSeatsPerShow();
    }
     
    public void totalCredit()
    {
        int totalCredit=getTotalShow()*getSeatsPerShow()*100;
        System.out.println("Credit Details");
        System.out.println("Total Credit Gained is " + totalCredit);
    }
    
}