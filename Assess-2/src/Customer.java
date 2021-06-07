
public class Customer {
	
	private	String name;
	private	String address;
	private	Integer age;
	private	String mobileNumber;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

//	public Customer(String name, String address, int age, String mobileNumber) {
//		// TODO Auto-generated constructor stub
//		this.name=name;
//		this.address=address;
//		this.age=age;
//		this.mobileNumber=mobileNumber;
//		
//	}

	void displayCustomer() {
		System.out.println("Bill Details");
		System.out.println("Name "+name);
		System.out.println("Mobile "+mobileNumber);
		System.out.println("Age "+age);
		System.out.println("Address "+address);
	}

}
