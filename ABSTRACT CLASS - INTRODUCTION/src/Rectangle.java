
public class Rectangle extends Shape{
	private float length;
	private float breadth;
	
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getBreadth() {
		return breadth;
	}
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	
	public Rectangle(float length, float breadth){
		this.length = length;
		this.breadth = breadth;
		
	}
	
	public double calculatePerimeter() {
		double per = 2*(length + breadth);
		return per;
	}
}
