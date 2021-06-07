
public class Customer {
	public String customerName,customerEmail, customerType, customerAddress;
	public Customer(String customerName, String customerEmail, String customerType, String customerAddress){
		this.customerName=customerName;
		this.customerEmail=customerEmail;
		this.customerType=customerType;
		this.customerAddress=customerAddress;
	}
	
	void displayDetails(){
		System.out.println("Name: "+customerName);
		System.out.println("E-mail: "+customerEmail);
		System.out.println("Type: "+customerType);
		System.out.println("Location: "+customerAddress);
	}
}
