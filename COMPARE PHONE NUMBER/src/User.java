
public class User {
	private String name;
	private String username;
	private String password;
	private long phoneNumber;
	
	public User(String name,String userName,String password,Long phoneNumber)
    {
		this.name=name;
        this.username=userName;
        this.password=password;
        this.phoneNumber=phoneNumber;  
      }
	   
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public boolean comparePhoneNumber(User user)
    {
        if(this.phoneNumber==user.phoneNumber)
            return true;
        else
            return false;
    }
}
