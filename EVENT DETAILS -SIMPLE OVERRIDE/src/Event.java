public class Event
{
    private String name;
    private String detail;
    private String organizer;
   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDetail() {
        return detail;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }
    public String getOrganizer() {
        return organizer;
    }
    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }
   
     public Event(String name, String detail, String organizer)
     {
         setName(name);
         setDetail(detail);
         setOrganizer(organizer);
     }
   
     public String toString()
    {
         return "Event Name : " + getName() +
                "\nEvent Detail : " + getDetail() +
                 "\nEvent Organizer : " + getOrganizer();
    }
    
     public void totalCredit()
     {
         System.out.println("Credit Details");
     }
   
}