public class Stall {

 

    public String name;
    public String detail;
    public String owner;
    public int cost;
    public Stall(String name, String detail, String owner, int cost) {
        this.name = name;
        this.detail = detail;
        this.owner = owner;
        this.cost = cost;
    }
    
    class GoldStall
    {
        public int tvSet;

 

        public GoldStall() {
        }
        public GoldStall(int tvSet)
        {
            this.tvSet = tvSet;
        }
        
        class PlatinumStall
        {
            public int projector;
            
            public PlatinumStall(){}
            public PlatinumStall(int projector) {
                this.projector = projector;
            }
        
            public void display()
            {    
                int totalcost = (cost + (tvSet*100) + (projector * 500));
                System.out.println("Stall Name:"+ name);
                System.out.println("Details:"+ detail);
                System.out.println("Owner Name:"+ owner);
                System.out.println("TV Sets:"+ tvSet);
                System.out.println("Projectors:"+ projector);
                System.out.println("Total Cost:"+ totalcost);
            }
        }
        
    }
}