package Task2;

public class Square extends Rectangle{
	double side;
	
	public Square(double side) {
		super(side, side);
	}
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {	
		this.side = side;
	}
	
	public double getArea() { 
		return side*side;
	}
	
	public double getPerimeter() {
		return 4*side;
	}
	
	public void setLength(double side) {
		super.setLength(side);
	}
	
	public void setWidth(double side) {
		super.setWidth(side);
	}
	public String toString() {
		return "Square [" + super.toString() + "]"; 
	}
}
