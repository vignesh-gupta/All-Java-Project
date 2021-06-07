public class User implements Comparable<User>
{
    private String name;
    private String mobileNumber;
    private String username;
    private String password;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } 

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
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

    public User(){}

    public User(String name, String mobileNumber, String username, String password) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.username = username;
        this.password = password;
    }
    
    public String toString()
    {
        String str=String.format("%-15s%-15s",this.name,this.mobileNumber);
        return str;
    }

    @Override
    public int compareTo(User u) {
        return this.name.compareTo(u.name);
    }
    
}