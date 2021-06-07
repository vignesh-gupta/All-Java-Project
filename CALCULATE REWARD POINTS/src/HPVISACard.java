class HPVISACard extends VISACard{
    public double computeRewardPoints(String type, double amount){
			
    	double reward = 0.01 * amount;
    	
    	if(type.equalsIgnoreCase("fuel"))
    		reward+=10;

         return reward;
    }
}
