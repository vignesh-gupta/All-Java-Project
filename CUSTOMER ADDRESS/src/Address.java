
public class Address {
	public String street,city,country;
	public int	pincode;
	
	public Address(String a, String b, int c, String d){
		street = a;
		city = b;
		country = d;
		pincode = c;
	}
	
	void displayAddress(){
		System.out.println("Street: "+street);
		System.out.println("City: "+city);
		System.out.println("Pincode: "+pincode);
		System.out.println("Country: "+country);
	}
}
