public class Event
{
   
    private String name;
    private String detail;
    private String type;
    private String organizer;
    private Integer attendeesCount;
    private Double projectedExpense;
   
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
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getOrganizer() {
        return organizer;
    }
    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }
    public Integer getAttendeesCount() {
        return attendeesCount;
    }
    public void setAttendeesCount(Integer attendeesCount) {
        this.attendeesCount = attendeesCount;
    }
    public Double getProjectedExpense() {
        return projectedExpense;
    }
    public void setProjectedExpense(Double projectedExpense) {
        this.projectedExpense = projectedExpense;
    }
   
    public Event(String name, String detail, String type, String organizer, Integer attendeesCount,Double projectedExpense)
    {
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.organizer = organizer;
        this.attendeesCount = attendeesCount;
        this.projectedExpense = projectedExpense;
    }
   
    public String toString()
    {
        return String.format("%-15s%-20s%-15s%-15s%-15s", this.name, this.detail, this.type, this.attendeesCount, this.projectedExpense);
    }
   
}