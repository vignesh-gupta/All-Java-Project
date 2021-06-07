
public class Square extends Shape{
	
	private float side;
	
	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}
	
	public Square(float side){
		this.side = side;
	}
	
	public double calculatePerimeter() {
		double per = 4*side;
		return per;
	}
	

}
