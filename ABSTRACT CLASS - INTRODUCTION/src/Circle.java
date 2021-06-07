
public class Circle extends Shape{
	private float radius;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	public  Circle(float radius){
		setRadius(radius);
	}

	@Override
	public double calculatePerimeter() {
		double per = 2*3.14*radius;
		return per;
	}
}
