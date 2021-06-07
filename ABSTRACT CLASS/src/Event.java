public abstract class Event {

    protected String name;
    protected String detail;
    protected String type;
    protected String organiser;
    
    Event(String name , String detail , String type , String organiser)
    {
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.organiser = organiser;
        
    }
    
    abstract double calculateAmount();
}