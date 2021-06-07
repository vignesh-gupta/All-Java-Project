
public class Rectangle {
	private int length;
	private int width;
	
	public Rectangle(int length ,int width){
		this.length = length;
		this.width = width;
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getwidth() {
		return width;
	}
	public void setwidth(int width) {
		this.width = width;
	}
	
	int area(){
		int area;
		area = length * width;
		return area;
		
	}
	void display(){
		System.out.println("Rectangle Dimension");
		System.out.println("Length:"+length);
		System.out.println("Width:"+width);
	}
	
	Rectangle dimensionChange(int newDimension){
		Rectangle rect = new Rectangle(length*newDimension , width*newDimension);
		return rect;
		
	}
}
