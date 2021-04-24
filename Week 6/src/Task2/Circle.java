package Task2;

public class Circle extends Shape{
	private double radius;
	
	public Circle() {
		super();
		setRadius(1.0);
	}
	
	public Circle(double r) {
		super();
		radius = r;
	}
	
	public Circle(double r, String color, boolean filled) {
		super(color, filled);
		this.setRadius(r);
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getPerimeter() {
		return 2*radius*Math.PI;
	}
	
	@Override
	public String toString() {
		return "Circle ["+ super.toString() + ", radius=" + getRadius() + "]";
	}
}
