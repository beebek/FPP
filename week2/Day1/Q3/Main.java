package week2.Day1.Q3;

public class Main {
	public static void main(String[] args) {
		GeometricObject g1 = new GeometricObject();
		GeometricObject g2 = new GeometricObject("purple", true);
		
		System.out.println("object g1, color: " + g1.getColor());
		System.out.println("object g1, filled: " + g1.isFilled());
		System.out.println("object g1, toString: " + g1.toString());
		
		System.out.println("object g2, color: " + g2.getColor());
		System.out.println("object g2, filled: " + g2.isFilled());
		System.out.println("object g2, toString: " + g2.toString());
		
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(2, 3);
		Rectangle rect3 = new Rectangle();
		rect3.setWidth(3);
		rect3.setHeight(4);
		rect3.setColor("green");
		rect3.setFilled(true);
		
		
		System.out.println();
		System.out.println("rect1, color: " + rect1.getColor());
		System.out.println("rect1, filled: " + rect1.isFilled());
		System.out.println("rect1, toString" + rect1.toString());
		System.out.println("rect1, width: " + rect1.getWidth());
		System.out.println("rect1, height: " + rect1.getHeight());
		System.out.println("rect1, perimeter: " + rect1.getPerimeter());
		System.out.println("rect1, area: " + rect1.getArea());
		System.out.println();		
		System.out.println("rect2, color: " + rect2.getColor());
		System.out.println("rect2, filled: " + rect2.isFilled());
		System.out.println("rect2, toString" + rect2.toString());
		System.out.println("rect2, width: " + rect2.getWidth());
		System.out.println("rect2, height: " + rect2.getHeight());
		System.out.println("rect2, perimeter: " + rect2.getPerimeter());
		System.out.println("rect2, area: " + rect2.getArea());
		System.out.println();
		System.out.println("rect3, color: " + rect3.getColor());
		System.out.println("rect3, filled: " + rect3.isFilled());
		System.out.println("rect3, toString" + rect3.toString());
		System.out.println("rect3, width: " + rect3.getWidth());
		System.out.println("rect3, height: " + rect3.getHeight());
		System.out.println("rect3, perimeter: " + rect3.getPerimeter());
		System.out.println("rect3, area: " + rect3.getArea());
		
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(2);
		Circle circle3 = new Circle();
		circle3.setColor("red");
		circle3.setFilled(true);
		System.out.println();
		System.out.println("circle1, color: " + circle1.getColor());
		System.out.println("circle1, filled: " + circle1.isFilled());
		System.out.println("circle1, toString" + circle1.toString());
		System.out.println("circle1, width: " + circle1.getRadius());
		System.out.println("circle1, height: " + circle1.getArea());
		System.out.println("circle1, perimeter: " + circle1.getPerimeter());
		System.out.println();
		System.out.println("circle2, color: " + circle2.getColor());
		System.out.println("circle2, filled: " + circle2.isFilled());
		System.out.println("circle2, toString" + circle2.toString());
		System.out.println("circle2, width: " + circle2.getRadius());
		System.out.println("circle2, height: " + circle2.getArea());
		System.out.println("circle2, perimeter: " + circle2.getPerimeter());
		System.out.println();
		System.out.println("circle3, color: " + circle3.getColor());
		System.out.println("circle3, filled: " + circle3.isFilled());
		System.out.println("circle3, toString" + circle3.toString());
		System.out.println("circle3, width: " + circle3.getRadius());
		System.out.println("circle3, height: " + circle3.getArea());
		System.out.println("circle3, perimeter: " + circle3.getPerimeter());
	}
}

// Output

/*
	object g1, color: white
	object g1, filled: false
	object g1, toString: created on Tue Jun 30 20:25:11 CDT 2015
	color: white and filled: false
	object g2, color: purple
	object g2, filled: true
	object g2, toString: created on Tue Jun 30 20:25:11 CDT 2015
	color: purple and filled: true
	
	rect1, color: white
	rect1, filled: false
	rect1, toStringcreated on Tue Jun 30 20:25:11 CDT 2015
	color: white and filled: false
	rect1, width: 0.0
	rect1, height: 0.0
	rect1, perimeter: 0.0
	rect1, area: 0.0
	
	rect2, color: white
	rect2, filled: false
	rect2, toStringcreated on Tue Jun 30 20:25:11 CDT 2015
	color: white and filled: false
	rect2, width: 2.0
	rect2, height: 3.0
	rect2, perimeter: 10.0
	rect2, area: 6.0
	
	rect3, color: green
	rect3, filled: true
	rect3, toStringcreated on Tue Jun 30 20:25:11 CDT 2015
	color: green and filled: true
	rect3, width: 3.0
	rect3, height: 4.0
	rect3, perimeter: 14.0
	rect3, area: 12.0
	
	circle1, color: white
	circle1, filled: false
	circle1, toStringcreated on Tue Jun 30 20:25:11 CDT 2015
	color: white and filled: false
	circle1, width: 0.0
	circle1, height: 0.0
	circle1, perimeter: 0.0
	
	circle2, color: white
	circle2, filled: false
	circle2, toStringcreated on Tue Jun 30 20:25:11 CDT 2015
	color: white and filled: false
	circle2, width: 2.0
	circle2, height: 12.566370614359172
	circle2, perimeter: 12.566370614359172
	
	circle3, color: red
	circle3, filled: true
	circle3, toStringcreated on Tue Jun 30 20:25:11 CDT 2015
	color: red and filled: true
	circle3, width: 0.0
	circle3, height: 0.0
	circle3, perimeter: 0.0
*/


