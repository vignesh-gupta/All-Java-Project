public class ItemType{
    
    Long id;
    String name;
    Double deposit;
    Double costPerDay;
    
    ItemType(){ }
    ItemType(Long id, String name, Double deposit, Double costPerDay){        
		 this.id = id;
		 this.name = name;
		 this.deposit = deposit;
		 this.costPerDay = costPerDay;    
    }
    
    public String getName() {
    	return name;
    }

    public void setName(String name) {
    	this.name = name;
    }
    
    
    public Double getDeposit() {
    	return deposit;
    }

    public void setDeposit(Double deposit) {
    	this.deposit = deposit;
    }
    
    public Long getId() {
    	return id;
    }

    public void setId(Long id) {
    	this.id = id;
    }
    
    public Double getCostPerDay() {
    	return costPerDay;
    }

    public void setCostPerDay(Double costPerDay) {
    	this.costPerDay = costPerDay;
    }
    
}


