import java.text.*;
public class ItemType {
    
    private String name;
	private double deposit;
	private double costPerDay;

	public ItemType(String name, double deposit, double costPerDay) {
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(Double costPerDay) {
		this.costPerDay = costPerDay;
	}

	public Double getDeposit() {
		return deposit;
	}

	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}
	
	public String toString() {
		DecimalFormat d=new DecimalFormat("0.0");
		String output = "The details of the item type are:\nName:"+name+"\nDeposit:"+d.format(deposit)+"\nCost Per Day:"+d.format(costPerDay);
		
		//fill your code here
		
		return output;
	}

	
}