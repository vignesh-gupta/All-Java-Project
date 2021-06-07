import java.io.*;
import java.util.List;

public class Hall {
	private String name;
    private String contact;
    private Double costPerDay;
    private String owner;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(Double costPerDay) {
		this.costPerDay = costPerDay;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Hall(String name, String contact, Double costPerDay, String owner) {
		super();
		this.name = name;
		this.contact = contact;
		this.costPerDay = costPerDay;
		this.owner = owner;
	}
	
	public String toString()
    {
        return (this.name + "," + this.contact + "," + this.costPerDay.toString() + "," + this.owner);
    }
	
	public static void writeHallDetails(List<Hall> halls) throws IOException{
		
		FileWriter fi = new FileWriter("hall.csv",false);
		BufferedWriter bw = new BufferedWriter(fi);
		
		for (Hall h: halls) {
            bw.append(h.toString());
            bw.newLine();
        }
		
		bw.close();
		fi.close();
	}
}
