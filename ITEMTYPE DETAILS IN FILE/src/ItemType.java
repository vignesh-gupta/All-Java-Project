public class ItemType {
     String name;
     double deposit;
     double costPerDay;
   
     ItemType() {}
    
      public ItemType(String name, double deposit, double costPerDay) {
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
      public double getDeposit() {
          return deposit;
        
      }
      public void setDeposit(double deposit) {
          this.deposit = deposit;
        
      }
    
   
     public String toString()
     {
         return String.format("%-15s %-15s %s\n", name, deposit, costPerDay);
     }
}