public class User {
 
    private String name;
    private    String mobile;
    private    String username;
    private    String password;
    
    public User(String name, String mobile, String username, String password) {
        this.name = name;
        this.mobile = mobile;
        this.username = username;
        this.password = password;
    }
    public User()
    {
        
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
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
    
   public String toString(){
       
       return "Name:"+this.name+"\n"+
               "Mobile:"+this.mobile+"\n"+
               "Username:"+this.username+"\n"+
               "Password:"+this.password;
   }
}