
public class Client implements Display{
	
	int id;
	private String name;
	private String middleName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String passport;
	private String countryCode;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Client(int id, String name, String middleName, String lastName, String phoneNumber, String email,
			String passport, String countryCode) {
		// TODO Auto-generated constructor stub
		setId(id);
		setName(name);
		setMiddleName(middleName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		setEmail(email);
		setPassport(passport);
		setCountryCode(countryCode);
	}

	@Override
	public void displayClientDetails() {
		// TODO Auto-generated method stub
		System.out.println("Client Details");
		System.out.println("Client Id : "+id);
		System.out.println("First Name : "+name);
		System.out.println("Middle Name : "+middleName);
		System.out.println("Last Name : "+lastName);
		System.out.println("Phone Number : "+phoneNumber);
		System.out.println("Email : "+email);
		System.out.println("Passport : "+passport);
		System.out.println("IATA Country Code : "+countryCode);
	}

}
