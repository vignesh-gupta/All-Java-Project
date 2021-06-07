import java.io.Serializable;

 

@SuppressWarnings("serial")
public class Customer implements Serializable 
{
    
    private String name;
    private Integer number;
    private String address;
    
    public Customer()
    {
        super();
    }
    
    public Customer(String name, Integer number, String address) {
        super();
        this.name = name;
        this.number = number;
        this.address = address;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}