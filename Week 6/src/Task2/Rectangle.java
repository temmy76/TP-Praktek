package Task2;

public class Rectangle extends Shape{
	private double width;
	private double length;
	
	public Rectangle() {
		super();
		setWidth(1.0);
		setLength(1.0);
	}
	
	public Rectangle(double w, double l) {
		super();
		setWidth(w);
		setLength(l);
	}
	
	public Rectangle(double w, double l, String color, boolean filled) {
		super(color, filled);
		setWidth(w);
		setLength(l);
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getArea() {
		return width*length;
	}
	public double getPerimeter() {
		return 2*(width + length);
	}
	public String toString() {
		return "Rectangle ["+ super.toString()+", width="+ getWidth() + ", length="+ getLength() + "]";
	}
}
