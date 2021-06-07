
public class Bike implements BikeSpeed,BikeDistance{
	
	private int speed;
	private int distance;
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public Bike(int distance, int speed) {
		// TODO Auto-generated constructor stub
		setSpeed(speed);
		setDistance(distance);
	}

	public int totalDistance() {
		// TODO Auto-generated method stub
		return speed*distance;
	}

	public int averageSpeed() {
		// TODO Auto-generated method stub
		return distance;
	}

}
