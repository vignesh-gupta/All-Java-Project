

public class User{
    private Long id;
    private String name;
    private String mobileNumber;
    private String username;
    private String password;
    
    public User(){}
    
    public User(String name,String mobileNumber,String username,String password){
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.username = username;
        this.password = password;
    }
    
    public User(Long id,String name,String mobileNumber,String username,String password){
        this.id =id;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.username = username;
        this.password = password;
    }
    
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id =  id;
    }
    public String getName(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public String getMobileNumber(){
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    
    public String toString()
    {
        return String.format( "%-15s%-15s%-15s%-15s" ,this.getName(), this.getMobileNumber(), this.getUsername(), this.getPassword());
    }

}