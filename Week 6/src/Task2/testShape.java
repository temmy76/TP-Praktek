package Task2;

public abstract class testShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape test = new Shape();
		System.out.println("Test class Shape\n");
		
		test.setColor("Red");
		test.setFilled(false);
		System.out.println(test.toString());
		test.setColor("Blue");
		test.setFilled(true);
		System.out.println(test.toString());
		
		System.out.println();
		System.out.println("test subclass Circle\n");
		
		Circle circ = new Circle();
		
		circ.setRadius(7.0);
		System.out.println(circ.getArea());
		System.out.println(circ.getPerimeter());
		System.out.println(circ.toString());
		
		System.out.println();
		System.out.println("test subclass Rectangle\n");
		
		Rectangle rect = new Rectangle();
		
		rect.setLength(5.0);
		rect.setWidth(7.0);
		System.out.println(rect.getArea());
		System.out.println(rect.getPerimeter());
		System.out.println(rect.toString());
		
		System.out.println();
		System.out.println("test subclass Square\n");
		
		Square sqr = new Square(5);
		
		sqr.setSide(5);
		System.out.println(sqr.getArea());
		System.out.println(sqr.getPerimeter());
		System.out.println(sqr.toString());
	}
}
