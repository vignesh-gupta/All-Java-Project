
public class Country {
	private String name;
	private String countryCode;
	private String isdCode;
	
	public Country(String name,String countryCode,String isdCode2){
		this.name = name;
		this.countryCode = countryCode;
		this.isdCode = isdCode2;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getIsdCode() {
		return isdCode;
	}

	public void setIsdCode(String isdCode) {
		this.isdCode = isdCode;
	}
	
	
	void display(){
		System.out.println("Country Name : "+name);
		System.out.println("Country Code : "+countryCode);
		System.out.println("ISD Code : "+isdCode);
	}
}
