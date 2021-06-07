import java.text.*;

public class ItemType {
	private String name;
	private double costPerDay;
	private double deposit;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public void display(){
		DecimalFormat df= new DecimalFormat("0.00");
		System.out.println("Item type details");
		System.out.println("Name : " +getName());
		System.out.println("CostPerDay : "+df.format(getCostPerDay()));
		System.out.println("Deposit : "+df.format(getDeposit()));

}
}